package practice;

public class Operators {
	public static void main(String[] args) {

        int a = 10, b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b)); 

        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b)); 

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));         

        int c = 15;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);

        int d = 3;
        System.out.println("\nUnary Operators:");
        System.out.println("++d = " + (++d)); 
        System.out.println("d-- = " + (d--)); 
        System.out.println("d after d-- = " + d);

        int age = 18;
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible";
        System.out.println("\nConditional (Ternary) Operator:");
        System.out.println(result);
    }
}
