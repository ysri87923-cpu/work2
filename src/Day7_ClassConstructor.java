/*
 * Day7_ClassConstructor.java
 * Concept: Class, Constructor
 *
 * A simple ATM Account class showing how a class bundles data + behavior,
 * and how constructors initialize objects.
 */

class Account {
    String accountNumber;
    String holderName;
    double balance;

    // Constructor
    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        System.out.println("Account created for " + holderName);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, balance);
        }
    }

    public void printStatement() {
        System.out.printf("[%s] %s -> Balance: %.2f%n", accountNumber, holderName, balance);
    }
}

public class Day7_ClassConstructor {
    public static void main(String[] args) {
        Account acc1 = new Account("AC001", "Asha", 1000);
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.printStatement();
    }
}