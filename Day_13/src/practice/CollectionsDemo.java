package practice;
import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. ArrayList");
        System.out.println("2. LinkedList");
        System.out.println("3. Vector");
        System.out.print("Choose a collection to use: ");
        int choice = sc.nextInt();

        List<String> list;

        switch (choice) {
            case 1:
                list = new ArrayList<>();
                System.out.println("You chose ArrayList.");
                break;
            case 2:
                list = new LinkedList<>();
                System.out.println("You chose LinkedList.");
                break;
            case 3:
                list = new Vector<>();
                System.out.println("You chose Vector.");
                break;
            default:
                System.out.println("Invalid choice. Using ArrayList by default.");
                list = new ArrayList<>();
        }

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("Elements in the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
