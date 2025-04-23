package Oops;

public class Human extends SeeFish {
	int hand;
	int leg;
	int height;
	int width;
	String brainsence;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human person1=new Human();
		person1.study();
		person1.earningmoney();
		person1.oar();	
		BankIob cus=new BankIob("sathish",7689,500);
		cus.withdraw(500);
		

	}
	public void study() {
		System.out.println("You Can Able to study");
	}
	public void earningmoney() {
		System.out.println("You Can Able to Earn Money");
	}

}
