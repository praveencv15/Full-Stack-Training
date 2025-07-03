package practice;
import java.util.Scanner;

public class CircleArea {
    double radius;
    double area;
    double circumference;
    CircleArea(double r) {
        radius = r;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        CircleArea c = new CircleArea(r);
        c.display();
    }
}
