
public class Bank {
	private int accountNumber;  // private access modifier to protect direct access
    private double balance;     // private access modifier to protect the balance

    // Constructor to initialize the Bank object
    Bank(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter method to access the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to set the balance (used carefully)
    public void setBalance(double balance) {
        if (balance >= 0) { // Ensuring balance can't be negative
            this.balance = balance;
        } else {
            System.out.println("Balance can't be negative!");
        }
    }

    // Deposit method to add money to the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method to remove money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
        return false;
    }
}
