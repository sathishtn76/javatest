package W3School;

import java.util.Scanner;



public class Swi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner Sc =new Scanner(System.in);
   System.out.println("Welcome To Our Hotel");
   System.out.println("Please Choose Your Menu");
   int Choice =Sc.nextInt();
   switch(Choice) {
   case 1:
	   System.out.println("Do You Want Briyani.....How Many Plots");
	   Scanner ob =new Scanner(System.in);
	   int op=ob.nextInt();
	   if(op<=10) {
		   System.out.println("Ohhh OK Wait A Minute");
	   }
	   else {
		   System.err.println("Ohh My God You Need More Than 10 Briyani Its Not POssible");
	   }
	   break;
   case 2:
	   System.out.println("Welcome To OUr Parota World...2 set 90");
	   break;
   case 3:
	   System.out.println("Welcome To Our Nanba Cakes");
	   break;
   }
   
	}

}
