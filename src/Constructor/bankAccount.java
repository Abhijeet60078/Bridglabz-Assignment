package Constructor;

class BankAccount {
    public int accountNumber;        // public
    protected String accountHolder;  // protected
    private double balance;          // private

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient Balance!");
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + accountHolder +
                ", Balance: ₹" + getBalance() +
                ", Interest Rate: " + interestRate + "%");
    }
}
