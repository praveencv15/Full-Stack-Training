package practice;
import java.util.*;

public class Constructor {
	    String name;
	    int rollno;

	    public Constructor(String name, int rollno) {
	        this.name = name;
	        this.rollno = rollno;
	    }
	    public void display() {
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollno);
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first letter of your name: ");
	        
	        String name = sc.nextLine();
	        System.out.print("Enter Roll No: ");
	        int rollno = sc.nextInt();

	        Constructor c = new Constructor(name, rollno);
	        c.display();
	        sc.close();
	}
}
