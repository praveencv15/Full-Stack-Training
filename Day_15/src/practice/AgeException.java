package practice;
import java.io.*;

class AgeValidation extends Exception {
    public AgeValidation(String message) {
        super(message);
    }
}

public class AgeException {
    public static void main(String[] args) {
        int age = 17;

        try {
            validateAge(age);
            System.out.println("You are eligible!");
        } catch (AgeValidation e) {
            System.out.println("Age Exception Caught: " + e.getMessage());
        }
    }
    public static void validateAge(int age) throws AgeValidation {
        if (age < 18) {
            throw new AgeValidation("You are not Eligible!");
        }
    }
}