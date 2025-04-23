package Oops;

public class Workers extends Employee{
	double bonus;

	Workers(String first_name, String last_name, String role) {
		super(first_name, last_name, role);
		// TODO Auto-generated constructor stub
	}
	
  Workers(double bonus){
	  this.bonus=bonus;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Workers pranesh=new Workers(500.0); 
	}

}
