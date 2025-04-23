package Oops;

public class BankParent {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	BankIob cus1=new BankIob("sathish",8767,600);
	cus1.setaccountname("sathish");
	cus1.setaccountnumber(4007);
	cus1.setbalance(2500);
	cus1.getaccountname();
	System.out.println("Intiall Balance:"+cus1.getbalance());
	cus1.getaccountname();
	cus1.depositmoney(2500);
	System.out.println("Deposit Money:"+cus1.getbalance());
	cus1.withdraw(3000);
	System.out.println("After Withdraw"+cus1.getbalance());
	}

}
