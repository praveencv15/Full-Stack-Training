package practice;
import java.util.*;

public class primeArray {
	public static void main(StringMethods[] args) {
		int[] primes = new int[10];
        int count = 0;
        int num = 2;
        while (count < 10) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        System.out.println("First 10 prime numbers:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
	}
}
