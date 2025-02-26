package Oops;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Emplyee {

	String firstname;
	String lastname;
	String email;
	int rollno;
	static String course = "java";
	
	
	Emplyee(String firstname,String lastname,String email,int rollno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.rollno=rollno;
	}

	public void register() {
       if(userdetails(firstname)) {
    	   System.err.println("This Name is Already Exit");
       }
       else {
    	   userdetails(firstname);
       }
	}
	 public boolean userdetails(String firstname) {
		 String []usernames= {"sathish","sangaiya"};
		 String []passwords= {"sathi","sangi"};
		 String []newusers=new String[10];
		 for(int i=0;i<usernames.length;i++) {
			 if(firstname.equals(usernames[i])) {
				 return true;
			 }
			 else {
				 newusers[i]=firstname;
			 }
		 }
		 System.out.println("Successfully registered");
		 
		 return false;
	 }
	

	public void login() {

	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Your Firstname");
		String firstname = obj.nextLine();
		System.out.println("Enter Your Lastname");
		String lastname = obj.nextLine();
		System.out.println("Enter Your Email");
		String email = obj.nextLine();
		System.out.println("Enter Your Rollno");
		int rollno = obj.nextInt();
		Emplyee emp1=new Emplyee(firstname,lastname,email,rollno);
		emp1.register();
	}

}
