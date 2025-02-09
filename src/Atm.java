
public class Atm {
	 // Check balance
    public void checkBalance(User user, Bank bank) {
        System.out.println(user.name + "'s Current Balance: $" + bank.getBalance());
    }

    // Deposit money
    public void depositMoney(User user, Bank bank, double amount) {
        System.out.println(user.name + " is depositing money...");
        bank.deposit(amount);
    }

    // Withdraw money
    public void withdrawMoney(User user, Bank bank, double amount) {
        System.out.println(user.name + " is attempting to withdraw money...");
        if (bank.withdraw(amount)) {
            System.out.println("Withdrawal successful for " + user.name);
        }
    }
}
