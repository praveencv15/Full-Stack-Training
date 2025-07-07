package practice;
import java.util.*;

public class WrapperDemo {
	public static void main(String[]args) {
	int num = 10;
    Integer boxedNum = num;
    System.out.println("Boxed (Integer object): " + boxedNum);
    
    Integer obj = 25;
    int unboxedNum = obj;
    System.out.println("Unboxed (int value): " + unboxedNum);

    Integer manualBox = Integer.valueOf(50);
    System.out.println("Manually boxed: " + manualBox);

    int manualUnbox = manualBox.intValue();
    System.out.println("Manually unboxed: " + manualUnbox);
}
}
