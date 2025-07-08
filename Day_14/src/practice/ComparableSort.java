package practice;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student other) {
        return this.age - other.age;
    }

    public String toString() {
        return name + " - " + age;
    }
}

public class ComparableSort {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 29));
        students.add(new Student("Charlie", 21));

        Collections.sort(students);

        System.out.println("Sorted Students by Age:");
        for (Student s : students) {
            System.out.println(s);
        }
	}
}
