package practice;
import java.util.*;

public class MapDemo {
	public static void main(String[]args) {
		 Map<Integer, String> map = new HashMap<>();

		 map.put(101, "Alice");
		 map.put(102, "Bob");
		 map.put(103, "Charlie");

	        System.out.println("Student ID and Names:");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	}
}
