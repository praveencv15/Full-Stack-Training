package practice;
import java.util.*;

public class InterfaceDemo {
	public static void main(String[]args) {
		Info obj = new Info();
		obj.show("Kalai");
		obj.display(55);
	}
}

interface Student{
	void show(String s);
}

interface Classroom{
	void display(int a);
}

class Info implements Student, Classroom{
	public void show(String s){
		System.out.println("Student Name: "+s);
	}
	
	public void display(int a) {
		System.out.println("Total Strength: "+a);
	}
}