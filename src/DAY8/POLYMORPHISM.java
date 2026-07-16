package DAY8;/*
 * Day8_InheritancePolymorphism.java
 * Concept: Inheritance, Polymorphism
 *
 * SavingsAccount and CurrentAccount both extend a base Account class.
 * Calling withdraw() through the parent reference resolves to the
 * correct child implementation at runtime (polymorphism).
 */

class Account {
    String accountNumber;
    String holderName;
    double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        System.out.println("Generic withdraw - should be overridden.");
    }

    public void printStatement() {
        System.out.printf("[%s] %s (%s) -> Balance: %.2f%n",
                accountNumber, holderName, getClass().getSimpleName(), balance);
    }
}

// Inheritance
class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Polymorphism: overriding withdraw()
    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Denied: savings account must keep minimum balance of " + MIN_BALANCE);
        } else {
            balance -= amount;
            System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, balance);
        }
    }
}

// Inheritance
class CurrentAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 1000.0;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Polymorphism: overriding withdraw()
    @Override
    public void withdraw(double amount) {
        if (balance - amount < -OVERDRAFT_LIMIT) {
            System.out.println("Denied: exceeds overdraft limit of " + OVERDRAFT_LIMIT);
        } else {
            balance -= amount;
            System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, balance);
        }
    }
}

class Day8_InheritancePolymorphism {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("SB001", "Asha", 2000);
        Account current = new CurrentAccount("CA001", "Rahul", 500);

        savings.withdraw(2200); // ok
        savings.withdraw(5000); // denied

        current.withdraw(1300); // ok, within overdraft
        current.withdraw(500);  // denied

        savings.printStatement();
        current.printStatement();
    }
}