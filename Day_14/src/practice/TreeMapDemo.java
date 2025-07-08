package practice;
import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> tr = new TreeMap<>();
		tr.put(1, "Kalai");
		tr.put(2, "Mugesh");
		tr.put(3, "Praveen");
		
		System.out.println("Roll.No\tName");
        for (Map.Entry<Integer, String> entry : tr.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
	}
}
