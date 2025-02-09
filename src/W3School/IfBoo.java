package W3School;

import java.util.Scanner;



public class IfBoo {
	
	public static void main(String[] args) {
		String usernames[]= {"sathish","kassy","sangaiya","parvathi","manoj"};
		 String passwords[]= {"sathi","kassy","sangi","par","mano"};
		 String currentuser[]= new String[usernames.length];
		 for(int i=0;i<currentuser.length;i++) {
			 currentuser[i]=usernames[i]+passwords[i];
		 }
		System.out.println(currentuser[2]);
	}

}
