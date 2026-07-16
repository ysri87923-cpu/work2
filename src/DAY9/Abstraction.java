package DAY9;/*
 * Day9_AbstractionEncapsulation.java
 * Concept: Abstraction, Encapsulation
 *
 * Account is now abstract (defines a contract, hides "how" behind "what").
 * Fields are private (encapsulation) and only reachable via
 * protected getters/setters or public methods.
 */

abstract class Account {
    // Encapsulation: private fields, no direct outside access
    private final String accountNumber;
    private final String holderName;
    private double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, getBalance());
    }

    // Abstraction: subclasses must define their own withdrawal rule
    public abstract void withdraw(double amount);

    // Abstraction: subclasses must define their own interest policy
    public abstract double getInterestRate();

    public void printStatement() {
        System.out.printf("[%s] %s (%s) -> Balance: %.2f, Interest: %.2f%%%n",
                accountNumber, holderName, getClass().getSimpleName(), getBalance(), getInterestRate());
    }
}

class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;
    private static final double INTEREST_RATE = 4.0;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < MIN_BALANCE) {
            System.out.println("Denied: must keep minimum balance of " + MIN_BALANCE);
        } else {
            setBalance(getBalance() - amount);
            System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, getBalance());
        }
    }

    @Override
    public double getInterestRate() {
        return INTEREST_RATE;
    }
}

class Day9_AbstractionEncapsulation {
    public static void main(String[] args) {
        Account acc = new SavingsAccount("SB001", "Asha", 2000);
        acc.deposit(500);
        acc.withdraw(2000);
        acc.printStatement();

        // acc.balance = 999999;  // Not allowed - encapsulation blocks direct access
        // Account a = new Account(...);  // Not allowed - Account is abstract
    }
}