package practice;
import java.util.*;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            int num = 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println(); 
        }
        sc.close();
}
}
