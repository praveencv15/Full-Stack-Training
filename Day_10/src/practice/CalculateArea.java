package practice;
import java.util.*;

public class CalculateArea {
	public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose a shape: ");
        System.out.print("1-Rectangle ");
        System.out.println("2-Circle");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();

                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();

                double rectArea = length * breadth;
                System.out.println("Area of Rectangle = " + rectArea);
                break;
            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                double circleArea = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + circleArea);
                break;
            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }
}
