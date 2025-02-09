package W3School;

import java.util.Scanner;

public class Loo {
	static Scanner Sc = new Scanner(System.in);
		String userdetails[] = {};
		static String database(String register) {
			String userdetails[] = { register };
			return userdetails[0];
		}

	
	static void Welcome() {
		System.out.println("1.Register");
		System.out.println("2.Sign Up");
		System.out.println("3.Exit");
	}

	static void register() {
		System.out.println("Enter Your Name");
		String name = Sc.next();
		Sc.nextLine();
		System.out.println("Enter Your Dob");
		String dob = Sc.nextLine();
		System.out.println("Enter Your Email");
		String email = Sc.nextLine();
		System.out.println("Enter Your Password");
		String password = Sc.nextLine();
		String register[] = { name, dob,email, password };
		for (int i = 0; i < register.length; i++) {
			database(register[i]);
		}
		System.out.println("Regitered Successfully");
	}

	static void signup() {
		System.out.println("Enter your Email");
		String email = Sc.next();
		System.out.println("Enter your password");
		String password = Sc.next();
		String signupuser[] = { email, password };
		for(int i=0;i<signupuser.length;i++) {
		System.out.println(database (signupuser[i]));
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Msp Sports Club Kodikurichi");
		Welcome();
		int choice = Sc.nextInt();
		if (choice == 1) {
			register();
		} else if (choice == 2) {
			signup();

		}

	}

}
