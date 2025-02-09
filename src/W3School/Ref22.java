package W3School;

import java.util.Scanner;

public class Ref22 {

	public static void main(String[] args) {
		System.out.println("TANDOOR DHARA");
		System.out.println("NANBA CAKES&FOOD BAZAR");
		Scanner sc = new Scanner(System.in);
		boolean isactive = true;
		System.out.println("You Want To see Our Menu Card?");
		String confirm = sc.nextLine();
		if (confirm.equals("yes")) {
			while (isactive) {
				String[] shawarma = { "1. Classic Chicken Shawarma-Rs.90", "2. Spicy Chicken Shawarma-Rs.90",
						"3. Beef Shawarma-Rs.120", "4. Tandoori Shawarma-Rs.130" };
				String[] starters = { "1.Tandoori Full-Rs.120", "2.Mayo Tandoori-Rs.149", "3.Garlic Tandoori-Rs.149",
						"4.Pepper Tandoori-Rs.149", "4.Honey Tandoori-Rs.180" };
				String[] gravymasala = { "1.Tandoori Chicken Masala-Rs.190", "2.Pepper Tandoori Masala-Rs.190",
						"3.Kadai Tandoori Masala-Rs.190", "4.Pepper Butter Masala-Rs.180" };
				final String YELLOW = "\033[33m";
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
				Scanner obj = new Scanner(System.in);
				System.out.println("What To You Want?");
				String userchoice = obj.nextLine();
				if (userchoice.equals("Shawarma")) {
					for (int i = 0; i < shawarma.length; i++) {
						System.out.println(shawarma[i]);
					}
					System.out.println("Which One?");
					int customerchoice = obj.nextInt();
					if (customerchoice == 1) {
						System.out.println("PerRoll:90Rs");
						System.out.println("How Many Chicken Shawarma you Want?");
						boolean flag = true;
						do {
							int cus2 = obj.nextInt();
							int price;
							int delivery;
							double result;
							switch (cus2) {
							case 5:
								price = 5 * 90;
								System.out.println("Shawarma:" + price);
								delivery = 50;
								System.out.println("Delivery Charge:" + delivery);
								result = (int) price + delivery;
								System.out.println("Total Amount:" + result);
								System.out.println("ThankYou");
								flag = false;
								break;
							case 10:
								price = 10 * 90;
								System.out.println("Shawarma:" + price);
								delivery = 50;
								System.out.println("Delivery Charge:" + delivery);
								result = (int) price + delivery;
								System.out.println("Total Amount:" + result);
								System.out.println("ThankYou");
//								isactive=false;
								flag = false;
								System.out.println("Do you want anything else?");
								String reconfirm=sc.nextLine();
								if(reconfirm.equals("yes")) {
									isactive=true;
								}
								else {
									isactive=false;
								}
								break;
							default:
								System.err.println("Sorry We Can't Delivery Your Order");
								System.out.println("Please Choose More Than Five");
							}
						} while (flag);

					}
				} else if (userchoice.equals("Starters")) {
					System.out.println("Which One?");
					for (int i = 0; i < starters.length; i++) {
						System.out.println(starters[i]);
					}
				} else if (userchoice.endsWith("Gravymasal")) {
					System.out.println("Which One?");
					for (int i = 0; i < gravymasala.length; i++) {
						System.out.println(gravymasala[i]);
					}
				} else {
					System.err.println("INVALID SELECTION");
				}
			}
		} else {
			System.out.println("ThankYou");
		}
	}
}
