package practice;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		for(int i : l) {
			System.out.println(i+" ");
		}
		List<String> st = new ArrayList<>();
		st.add("Kalai");
		st.add("Praveen");
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		st.forEach(s -> System.out.println(s));
	}
}
