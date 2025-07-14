package practice;
import java.util.*;

public class SplitDemo {
	public static void main(String[] args) {
		String s = "Kalai,mugesh:Mobile";
		String []info = s.split("[,:]");
		for(String i : info) {
			System.out.println(i);
		}
	}
}
