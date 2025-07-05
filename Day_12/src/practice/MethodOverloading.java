package practice;
import java.util.*;

public class MethodOverloading {
	    void show() {
	        System.out.println("Hello, this is method with no parameters.");
	    }
	    void show(int a) {
	        System.out.println("Method with one integer: " + a);
	    }
	    void show(int a, String b) {
	        System.out.println("Method with int and String: " + a + ", " + b);
	    }
	    void show(double a, float b) {
	        System.out.println("Method with double and float: " + (a + b));
	    }
	    public static void main(String[] args) {
	    	MethodOverloading obj = new MethodOverloading();

	        obj.show();    
	        obj.show(10);             
	        obj.show(20, "Praveen");  
	        obj.show(3.5, 4.5f);  
	    }
	}

