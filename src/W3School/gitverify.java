package W3School;

import java.util.Scanner;

public class gitverify {
	static Scanner sc = new Scanner(System.in);

	static void showoption() {
		String menu[] = { "1.Sign up","2.Login","3.Exit" };
		for (String options : menu) {
			System.out.println(options);
		}

	}
	static void usersignup() {
		String newuser[]= {"Enter Your First Name","Enter Your Last Name","Enter Your Mop"};
	    String getuserdetails[]= {"Firstname","Lastname","Mob"};
	    for(int i=0;i<newuser.length;i++) {
	    	System.out.println(newuser[i]);
	    	getuserdetails[i]=sc.nextLine();
	    }
	  
	}

	public static void main(String[] args) {
		System.out.println("Welcome to our where is my bus application");
		System.out.println("Are you sure you want to continue(Yes/No)");
		String userconfirm = sc.nextLine();
		if (userconfirm.equals("Yes") || userconfirm.equals("Y") || userconfirm.equals("yes")) {
			showoption();
		} else {
			System.out.println("Thankyou");
		}
		String choice=sc.nextLine();
		if(choice.equals("Signup")||choice.equals("1")||choice.equals("signup")) {
			usersignup();
		}
	}

}
