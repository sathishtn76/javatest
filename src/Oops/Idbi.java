package Oops;

public class Idbi {
	private String first_name;
	private String last_name;
	private String mob;
	private String email;
	private double bal;
	private double acc_number;
	
	Idbi(String first_name,String last_name,String mob,String email,double bal,double acc_number){
		this.first_name=first_name;
		this.last_name=last_name;
		this.mob=mob;
		this.email=email;
		this.bal =bal;
		this.acc_number=acc_number;
	}
	Idbi(String first_name,String last_name,double bal,double acc_number){
		this.first_name =first_name;
		this.last_name=last_name;
		this.bal=bal;
		this.acc_number=acc_number;
	}
	public void depositmoney(double amount) {
		
	}
	public void checkbalnce() {
		
	}
	public void setfirstname(String firstname) {
		this.first_name=firstname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are using constructor to initialize the values
		Idbi cus=new Idbi("sathish","s","sathishsangaiya85@gmail.com","6369337253",500.0,1382010000);
		cus.first_name="preethi";
		cus.last_name="p";
//		cus.setfirstname("sathi");
		System.out.println("After Changing the name: " +cus.first_name);
		Idbi cus2=new Idbi("kassy","vinayak",500.0,1382999);
	
		

	}

}
