package practice;
import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> st = new HashMap<>();

		st.put(101, "Rahul");
        st.put(102, "Anjali");
        st.put(103, "Sneha");
        st.put(104, "Vikram");

        System.out.println("Roll.No\tName");
        for (Map.Entry<Integer, String> entry : st.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
	}
}
