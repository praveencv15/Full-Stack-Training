package practice;
import java.util.*;

public class StackDemo {
	 public static void main(String[] args) {
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 1; i <= 5; i++) {
	            stack.push(i * 10); 
	        }
	        System.out.println("Stack after pushing: " + stack);
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Popped: " + stack.pop());
	        }
	        System.out.println("Is stack empty? " + stack.isEmpty());
	    }
}
