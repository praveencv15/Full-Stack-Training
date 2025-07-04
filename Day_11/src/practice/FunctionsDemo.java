package practice;
import java.util.*;

public class FunctionsDemo {
	public static void printArray(int[] arr) {
        System.out.print("Array Elements: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        printArray(numbers);
        int total = calculateSum(numbers);
        System.out.println("Sum of elements: " + total);
    }
}
