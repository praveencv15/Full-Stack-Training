import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if(a >= 90 && a <= 100){
                System.out.print("A");
            }
            else if(a > 100 || a < 0){
                System.out.print("Unrecognized Grade.");
            }
            else if(a >= 80 && a < 90){
                System.out.print("B");
            }
            else if(a >= 70 && a < 80){
                System.out.print("C");
            }
            else{
                System.out.print("FAIL");
            }
        }
    }
}
