import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            for(int i = 1; i <= a; i++){
                for(int j = i; j < a; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }}
