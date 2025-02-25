package Oops;

import java.util.Scanner;

public class Student {
	String firstname;
	String lastname;
	String passwords;
	String email;
	int rollno;
	static String course="cse";
	
	Student(String firstname,String lastname,String passwords,String email,int rollno){
		this.firstname=firstname;
		this.lastname=lastname;
		this.passwords=passwords;
		this.email=email;
		this.rollno=rollno;
	}
	
	 public void register() {
		if(userdetails(firstname)) {
			System.err.println(firstname+"This Name is Already Exit");
		}
		else {
			userdetails(firstname,passwords);
		}
    
	}
	public boolean userdetails(String firstname) {
		String []usernames= {"sathish","manoj","parvathi","sangaiya"};
		for(int i=0;i<usernames.length;i++) {
			if(firstname.equals(usernames[i])) {
				return true;
			}
		}
		
		return false;
	}
	public boolean userdetails(String firstname,String password) {
		String []usernames= {"sathish","manoj","parvathi","sangaiya"};
		String []passwords= {"sathi","mano","par","san"};
		for(int i=0;i<usernames.length;i++) {
			if(firstname.equals(usernames[i]) && password.equals(passwords[i])){
				return true;
			}
		}
		return false;
	}
	 public void login() {
        if(userdetails(firstname, passwords)) {
        	System.out.println("Login Successfully");
        }
        else {
        	System.out.println("Incorrect password");
        }
	}

	public static void main(String[] args) {
		 Scanner obj=new Scanner(System.in);
		 System.out.println("Enter Your FirstName");
		 String  firstname=obj.nextLine();
		 System.out.println("Enter Your LastName");
		 String  lastname=obj.nextLine();
		 System.out.println("Enter Your Password");
		 String  password=obj.nextLine();
		 System.out.println("Enter Your Email");
		 String  email=obj.nextLine();
		 System.out.println("Enter Your Roll Number");
		 int rollno=obj.nextInt();
		 Student student=new Student(firstname,lastname,password,email,rollno);
//		 student.register();
		 student.login();
	
		
	}

	
}
