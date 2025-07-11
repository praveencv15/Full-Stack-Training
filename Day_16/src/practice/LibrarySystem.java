package practice;
import java.util.*;

class Book {
 int id;
 String title;
 boolean isBorrowed;

 Book(int id, String title) {
     this.id = id;
     this.title = title;
     this.isBorrowed = false;
 }

 public String toString() {
     return "Book ID: " + id + ", Title: " + title + ", Borrowed: " + isBorrowed;
 }
}

class Member {
 int id;
 String name;
 ArrayList<Integer> borrowedBookIds;

 Member(int id, String name) {
     this.id = id;
     this.name = name;
     borrowedBookIds = new ArrayList<>();
 }
}

class Library {
 HashMap<Integer, Book> books = new HashMap<>();
 HashMap<Integer, Member> members = new HashMap<>();
 Scanner sc = new Scanner(System.in);

 void addBook() {
     System.out.print("Enter Book ID: ");
     int id = sc.nextInt();
     sc.nextLine();
     if (books.containsKey(id)) {
         System.out.println("Book ID already exists!");
         return;
     }
     System.out.print("Enter Title: ");
     String title = sc.nextLine();
     books.put(id, new Book(id, title));
     System.out.println("Book added!");
 }

 void viewBooks() {
     if (books.isEmpty()) {
         System.out.println("No books available.");
         return;
     }
     for (Book b : books.values()) {
         System.out.println(b);
     }
 }

 void registerMember() {
     System.out.print("Enter Member ID: ");
     int id = sc.nextInt();
     sc.nextLine();
     if (members.containsKey(id)) {
         System.out.println("Member already exists.");
         return;
     }
     System.out.print("Enter Name: ");
     String name = sc.nextLine();
     members.put(id, new Member(id, name));
     System.out.println("Member registered!");
 }

 void borrowBook() {
     System.out.print("Enter Member ID: ");
     int mid = sc.nextInt();
     Member m = members.get(mid);
     if (m == null) {
         System.out.println("Member not found.");
         return;
     }
     if (m.borrowedBookIds.size() >= 5) {
         System.out.println("You can't borrow more than 5 books.");
         return;
     }
     System.out.print("Enter Book ID to borrow: ");
     int bid = sc.nextInt();
     Book b = books.get(bid);
     if (b == null) {
         System.out.println("Book not found.");
         return;
     }
     if (b.isBorrowed) {
         System.out.println("Book already borrowed.");
         return;
     }
     b.isBorrowed = true;
     m.borrowedBookIds.add(bid);
     System.out.println("Book borrowed.");
 }

 void returnBook() {
     System.out.print("Enter Member ID: ");
     int mid = sc.nextInt();
     Member m = members.get(mid);
     if (m == null) {
         System.out.println("Member not found.");
         return;
     }
     System.out.print("Enter Book ID to return: ");
     int bid = sc.nextInt();
     if (!m.borrowedBookIds.contains(bid)) {
         System.out.println("You have not borrowed this book.");
         return;
     }
     Book b = books.get(bid);
     if (b != null) {
         b.isBorrowed = false;
     }
     m.borrowedBookIds.remove(Integer.valueOf(bid));
     System.out.println("Book returned.");
 }

 void run() {
     while (true) {
         System.out.println("\n1. Add Book (Admin)");
         System.out.println("2. View Books (Admin)");
         System.out.println("3. Register Member");
         System.out.println("4. Borrow Book");
         System.out.println("5. Return Book");
         System.out.println("6. Exit");
         System.out.print("Choose: ");
         int choice = sc.nextInt();

         switch (choice) {
             case 1: addBook(); break;
             case 2: viewBooks(); break;
             case 3: registerMember(); break;
             case 4: borrowBook(); break;
             case 5: returnBook(); break;
             case 6: System.exit(0);
             default: System.out.println("Invalid choice.");
         }
     }
 }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.run();
    }
}
