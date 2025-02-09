
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a User
        User user = new User("John Doe", 12345);

        // Create a Bank account with an initial balance of $1000
        Bank bank = new Bank(user.accountNumber, 1000);

        // Use setter to change the balance directly
        bank.setBalance(5000);  // Directly set balance to $5000
        System.out.println("Updated Balance: $" + bank.getBalance());

        // Now use the ATM to interact
        Atm atm = new Atm();
        atm.checkBalance(user, bank); // Check balance
        atm.depositMoney(user, bank, 500); // Deposit $500
        atm.checkBalance(user, bank); // Check balance after deposit
	}

}
