package practice;
import java.util.*;

public class Recursion {
	   static int factorial(int n) {
	       if (n == 0 || n == 1)
	           return 1;
	       else
	           return n * factorial(n - 1);
	 }
	  public static void main(StringMethods[] args) {
	       int num = 5;
	       int result = factorial(num);
	       System.out.println("Factorial of " + num + " is: " + result);
	 }
}
