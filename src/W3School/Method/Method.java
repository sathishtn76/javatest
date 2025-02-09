package W3School.Method;

import java.util.Scanner;

public class Method {
   
	static void menuitems() {
		String[] shawarma = { "1. Classic Chicken Shawarma-Rs.90", "2. Spicy Chicken Shawarma-Rs.90",
				"3. Beef Shawarma-Rs.120", "4. Tandoori Shawarma-Rs.130" };
		String[] starters = { "1.Tandoori Full-Rs.120", "2.Mayo Tandoori-Rs.149", "3.Garlic Tandoori-Rs.149",
				"4.Pepper Tandoori-Rs.149", "4.Honey Tandoori-Rs.180" };
		String[] gravymasala = { "1.Tandoori Chicken Masala-Rs.190", "2.Pepper Tandoori Masala-Rs.190",
				"3.Kadai Tandoori Masala-Rs.190", "4.Pepper Butter Masala-Rs.180" };
		System.out.println("SHAWARMA");
		for (int i = 0; i < shawarma.length; i++) {
			System.out.println(shawarma[i]);
		}
		System.out.println("STARTERS");
		for (int i = 0; i < starters.length; i++) {
			System.out.println(starters[i]);
		}
		System.out.println("GRAVYMASALA");
		for (int i = 0; i < gravymasala.length; i++) {
			System.out.println(gravymasala[i]);
		}
	}
	
	static void shawarma() {
		String[] shawarma = { "1. Classic Chicken Shawarma-Rs.90", "2. Spicy Chicken Shawarma-Rs.90",
				"3. Beef Shawarma-Rs.120", "4. Tandoori Shawarma-Rs.130" };
		
		for (int i = 0; i < shawarma.length; i++) {
			System.out.println(shawarma[i]);
		}
		
	}
	
	static void starters() {
		String[] starters = { "1.Tandoori Full-Rs.120", "2.Mayo Tandoori-Rs.149", "3.Garlic Tandoori-Rs.149",
				"4.Pepper Tandoori-Rs.149", "4.Honey Tandoori-Rs.180" };
		
		for (int i=0;i<starters.length;i++) {
			System.out.println(starters[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("NANBA CAKES&FOOD BAZAR");
		Scanner sc = new Scanner(System.in);
		boolean isactive = true;
		System.out.println("You Want To see Our Menu Card?");
		String confirm = sc.nextLine();
		if (confirm.equals("yes")) {
			menuitems();
		}
		System.out.println("what do you want..?");
		String userchoice = sc.nextLine();
		if(userchoice.equals("Shawarma")) {
			shawarma();
			
		}	
		else if(userchoice.equals("Starters")) {
			starters();
		}
	}

}
