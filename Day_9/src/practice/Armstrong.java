package practice;

import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;
        while (number != 0) {
            int digit = number % 10;
            result += digit * digit * digit;
            number = number / 10;
        }

        if (result == originalNumber)
            System.out.println(originalNumber + " is an Armstrong Number.");
        else
            System.out.println(originalNumber + " is Not an Armstrong Number.");
        scanner.close();
    }
}
