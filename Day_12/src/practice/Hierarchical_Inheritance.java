package practice;
import java.util.*;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        sbi.accountType();
        sbi.savingsAccount();
        sbi.currentAccount();

        hdfc.accountType();
        hdfc.savingsAccount();
        hdfc.currentAccount();
    }
}

class Bank {
    void accountType() {
        System.out.println("Savings and Current account:");
    }
}

class SBI extends Bank {
    void savingsAccount() {
        System.out.println("SBI Savings Account: 500000");
    }

    void currentAccount() {
        System.out.println("SBI Current Account: 75000");
    }
}

class HDFC extends Bank {
    void savingsAccount() {
        System.out.println("HDFC Savings Account: 650000");
    }

    void currentAccount() {
        System.out.println("HDFC Current Account: 85500");
    }
}
