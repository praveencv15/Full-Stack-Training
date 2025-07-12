package practice;
import java.util.*;

public class BankProblem {
    int balance = 0;

    public synchronized void withdraw(int amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            wait();
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
        notify();
    }

    public static void main(String[] args) {
    	BankProblem bank = new BankProblem();

        Thread customer = new Thread(() -> {
            try {
                bank.withdraw(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread bankThread = new Thread(() -> {
            bank.deposit(500);
            bank.deposit(1000);
        });

        customer.start();
        bankThread.start();

        try {
            customer.join();
            bankThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
