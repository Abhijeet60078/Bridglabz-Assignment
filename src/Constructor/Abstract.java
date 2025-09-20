package Constructor;
abstract class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    abstract void withdraw(double amount);


    abstract void deposit(double amount);


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