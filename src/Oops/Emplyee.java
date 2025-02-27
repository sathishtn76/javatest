package Oops;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Emplyee {

	String firstname;
	String lastname;
	String email;
	String password;
	int rollno;
	static String course = "java";
	
	
	Emplyee(String firstname,String lastname,String email,String password,int rollno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
		this.password=password;
		this.rollno=rollno;
	}

	Emplyee(String email,String password){
		this.email=email;
		this.password=password;
	}

	public void register() {
       if(usernames(firstname)) {
    	   System.err.println("This Name is Already Exit");
       }
       else {
    	  System.out.println("Successfully resgisterd");
       }
	}
	 public boolean usernames(String firstname) {
		 String []usernames= {"sathish","sangaiya"};
		 for(int i=0;i<usernames.length;i++) {
			 if(firstname.equals(usernames[i])) {
				 return true;
			 }
		 }
		 return false;
	 }
	public void login(String emails,String passwords) {
      String []existingemail= {"sathi@gmail.com","spsathish@gmail.com"};
	  String []exitingpassword= {"sathi","kassy"};
	  for(int i=0;i<existingemail.length;i++) {
		  if(email.equals(existingemail[i])&& password.equals(exitingpassword[i])) {
			  System.out.println(" login Successfully");
		  }
	  }
	}

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Welcome To Our application");
		System.out.println("1-Register");
		System.out.println("2-Login");
		int chioce=obj.nextInt();
		if(chioce==1) {
		System.out.println("Enter Your Firstname");
		String firstname = obj.nextLine();
		obj.nextLine();
		System.out.println("Enter Your Lastname");
		obj.nextLine();
		String lastname = obj.nextLine();
		System.out.println("Enter Your Email");
		String email = obj.nextLine();
		obj.nextLine();
		System.out.println("Enter Your Password");
		String password = obj.nextLine();
		System.out.println("Enter Your Rollno");
		int rollno = obj.nextInt();
		Emplyee emp1=new Emplyee(firstname,lastname,email,password,rollno);
		emp1.register();
		}
		else if(chioce==2){
			System.out.println("Enter Your Email");
			String email = obj.next();
			obj.nextLine();
			System.out.println("Enter Your Password");
			String password = obj.nextLine();
			Emplyee emp2=new Emplyee(email,password);
			emp2.login(email,password);
		}
		
	}

}
