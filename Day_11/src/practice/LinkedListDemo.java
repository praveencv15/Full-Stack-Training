package practice;
import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        if (names.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("The list is not empty.");
        }
        System.out.println("\nNames in the LinkedList:");
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println(name);
        }
        if (names.contains("Bob")) {
            System.out.println("\nBob is in the list.");
        } else {
            System.out.println("\nBob is not in the list.");
        }
	}
}
