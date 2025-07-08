package practice;
import java.util.*;

public class LinearSearch {
	public static void main(String[] args) {
		int t = 5;
		int[] arr = {45, 6, 31, 76, 5};
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == t) {
				System.out.print("The index of target: "+i);
			}
		}
	}
}
