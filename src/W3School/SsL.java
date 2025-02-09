package W3School;

import java.util.Scanner;

public class SsL {
	static Scanner sc = new Scanner(System.in);

	static void showmenus() {
		System.out.println("Are you sure you want continue this page(Yes/No)");
		String userconfirm = sc.nextLine();
		if (userconfirm.equals("yes") || userconfirm.equals("Yes") || userconfirm.equals("Y")) {
			String[] userform = { "1.SignUp,2.Login,3.Exit" };
			for (String userforms : userform) {
				System.out.println(userforms);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("welcome To Our Tenkasi Bus Reservation");
		showmenus();
	}

}
