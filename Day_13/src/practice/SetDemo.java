package practice;
import java.util.*;
import java.util.stream.Collectors;

public class SetDemo {
	public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("Fruits in the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        Set<String> countries = new LinkedHashSet<>();

        countries.add("India");
        countries.add("USA");
        countries.add("Australia");
        countries.add("India");
        
        System.out.println("\nCountries in LinkedHashSet:");
        for (String country : countries) {
            System.out.println(country);
        }
        
        List<Integer> li = Arrays.asList(4, 9, 6, 1, 7);
        System.out.println(li);
        
        Set<Integer> se = new HashSet<>(li);
        System.out.println(se);
        
        Set<Integer> oddSet = li.stream().filter(num -> num % 2 !=  0).collect(Collectors.toSet());
        System.out.print(oddSet);
    }
}
