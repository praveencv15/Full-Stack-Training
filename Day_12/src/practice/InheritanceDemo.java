package practice;
import java.util.*;

class Calculator1 {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
}
class Calculator2 extends Calculator1 {
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        if (b != 0)
            return a / b;
        else
            return 0;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        System.out.println("Add: " + calc.add(10, 5));
        System.out.println("Subtract: " + calc.subtract(10, 5));
        System.out.println("Multiply: " + calc.multiply(10, 5));
        System.out.println("Divide: " + calc.divide(10, 5));
    }
}
