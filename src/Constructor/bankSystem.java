// File name: BankSystem.java

/*
abstract class bankSystem  {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract methods (must be implemented by child classes)
    abstract void withdraw(double amount);
    abstract void deposit(double amount);

    // Concrete method (common for all accounts)
    void displayBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }
}

// Child class: Saving Account
class SavingAccount extends Account {
    double interestRate = 0.03; // 3% interest

    SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited " + amount + " with interest in Savings Account.");
    }
}

// Child class: Current Account
class CurrentAccount extends Account {
    double overdraftLimit = 5000; // Can withdraw extra up to 5000

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded in Current Account.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account.");
    }
}

// Main class to test
public class bankSystem {
    public static void main(String[] args) {
        Account savings = new SavingAccount("Abhijeet", 10000);
        Account current = new CurrentAccount("Mishra", 5000);

        savings.deposit(2000);
        savings.withdraw(3000);
        savings.displayBalance();

        System.out.println("----------------------");

        current.deposit(4000);
        current.withdraw(12000);
        current.displayBalance();
    }
}
*/
