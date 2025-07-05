package practice;
import java.util.*;

public class ThisDemo {
    int id;
    String name;
    void setDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void showDetails() {
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
    }
	public static void main(String[] args) {
		ThisDemo s1 = new ThisDemo();
        s1.setDetails(101, "Praveen");
        s1.showDetails();
	}
}
