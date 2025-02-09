package W3School;

import java.util.Scanner;
public class Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean show=true;
		while(show) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Our Nanba Cakes Hotel");
		String[] snacks= {"1.Breed Baji-Rs.10","2.egg baji-Rs.20","3.Ulantha Vadai-RS.10","4.Cake-Rs.15","5.Sweet Baji-Rs.10"};
         int i=0;
		while(i<snacks.length) {
			System.out.println(snacks[i]);
			i++;
		}
//		show=false;
		System.out.println("Choose Your Menu");
		int choise=sc.nextInt();
		switch(choise) {
		case 1:
			System.out.println("How Many Breed Baji You Want");
			int choise1=sc.nextInt();
			if(choise1>10) {
				System.out.println("You Need More Than 10 Breed Baji...Its Not POssible...");
			}
			else if(choise1>=5) {
				System.out.println("You Need 5 to 10 Breed Baji....OK Please Wait ... ");
			}
			else {
				System.out.println("Please Take That...");
			}
			break;
		case 2:
			System.out.println("How Many egg Baji You Want ..?");
			break;
		case 3:
			System.out.println("How Many Ulantha Vadai You Want ..?");
			break;
		case 4:
			boolean flag=true;
			while(flag) {
			System.out.println("Which Type Of Cake you Want");
			String[] Cakes= {"Veanila","BlackForest","PineAppleCake"};
			for(int j=0;j<Cakes.length;j++) {
				System.out.println(Cakes[j]);
			}
			System.out.println("How Many Cake You Want ..?");
			int choice2=sc.nextInt();
			if(choice2==10) {
				String[]district= {"Tenkasi","Madurai","PavoorChatriram"};
				for(int d=0;d<district.length;d++) {
					System.out.println(district[d]);
				}
				System.out.println("Which District You Want Cake...?");
//				flag=true;
//				String enteryourplace=sc.nextLine();
//				sc.nextLine(); 
				int enteryourplace=sc.nextInt();
				
				switch(enteryourplace) {
				case 1:
					System.out.println("Sure....Your Delivery Will Receive 5 to 10 Mins");
					break;
					
				case 2:
					System.out.println("Sure....Your Delivery Will Receive 5 to 10 Mins");
					break;
					
				default:
					System.err.println("plese enter above the district");
					break;
				}
				flag=false;
				
			}
			else if(choice2==2) {
				System.err.println("Please Wait I will Call you Back Later");
				flag=false;
			}
			else {
				System.out.println("Its Not Possible To Delivery Your Adderess");
			}
			}
			break;
		case 5:
			System.out.println("How Many Sweet Baji You Want ..?");
			break;
		}
		
		}
	}

}
