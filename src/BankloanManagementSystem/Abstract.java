package BankloanManagementSystem;

abstract class Account {
    private final String accountNumber; // final = immutable
    protected double balance;
    protected String owner;

    public Account(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
            return true;
        } else {
            System.out.println("Insufficient balance in account: " + accountNumber);
            return false;
        }
    }
}
