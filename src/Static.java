
public class Static {
//   static {
//	   System.out.println("hello form static block");
//   }
//   {
//	   System.out.println("hello form non-static block");
//   }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Static sc=new Static();
//		System.out.println("hi form main method");
//	}
	static double interestRate = 3.5;  // Static field shared by all accounts
    String accountHolder;             // Non-static field
    double balance;                   // Non-static field

    // Non-static method
    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Static method
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static void main(String[] args) {
        // Creating objects for different accounts
    	Static acc1 = new Static();
        acc1.accountHolder = "John Doe";
        acc1.balance = 1000;

        Static acc2 = new Static();
        acc2.accountHolder = "Jane Doe";
        acc2.balance = 2000;

        // Accessing static method
        Static.updateInterestRate(4.0);

        // Accessing non-static method
        acc1.displayDetails();
        acc2.displayDetails();
    }

}
