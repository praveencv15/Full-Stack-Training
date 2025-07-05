package practice;
import java.util.*;

public class ArmstrongPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[] as = new int[rows * (rows + 1) / 2];
        int count = 0, num = 1;
        while (count < as.length) {
            if (isArmstrong(num)) {
                as[count] = num;
                count++;
            }
            num++;
        }
        int index = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(as[index++] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
	}
}
