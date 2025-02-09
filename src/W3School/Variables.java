package W3School;

import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String username="sathish";
	String password="123";
	Scanner sc=new Scanner(System.in);
	System.out.println("plese enter your username");
	String getuser=sc.nextLine();
	System.out.println("please enter your password");
	String getpassword=sc.nextLine();
	if(username.equals(getuser) && password.equals(getpassword)) {
		System.out.println("Welcome Back");
	}
	else if(username.equals(getuser) || !password.equals(getpassword)) {
		System.err.println("Incorrect password");
	}
 }
}
