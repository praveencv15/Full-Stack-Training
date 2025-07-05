package practice;
import java.util.*;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound(); 
        
        Dog dog = new Dog();
        dog.makeSound(); 

        Cat cat = new Cat();
        cat.makeSound();

        Animal ref;

        ref = new Dog();
        ref.makeSound();

        ref = new Cat();
        ref.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
