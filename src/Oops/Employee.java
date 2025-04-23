package Oops;

public class Employee {
	String first_name;
	String last_name;
	String role;
	
   Employee(String first_name,String last_name,String role){
	   this.first_name=first_name;
	   this.last_name=last_name;
	   this.role=role;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void workinghours() {
		System.out.println("weekly 6 days");
	}
	public void weeklyholiday() {
		System.out.println("sunday");
	}

}
