package practice;
import java.util.*;

public class Calculate_Tax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your basic salary: ");
        double basic = scanner.nextDouble();
        double hra = 0.20 * basic;              
        double ta = 0.10 * basic;             
        double otherAllowances = basic;      
        double totalSalary = basic + hra + ta + otherAllowances;
        double tax = 0.10 * totalSalary;

        System.out.println("Basic Salary: ₹" + basic);
        System.out.println("HRA (20%): ₹" + hra);
        System.out.println("TA (10%): ₹" + ta);
        System.out.println("Other Allowances (100%): ₹" + otherAllowances);
        System.out.println("Total Salary: ₹" + totalSalary);
        System.out.println("Tax (10%): ₹" + tax);

        scanner.close();
    }
}
