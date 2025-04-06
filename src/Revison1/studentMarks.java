package Revison1;

import java.util.Scanner;

public class studentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Please Enter Your Marks");
       System.out.println("enter your Math Marks");
       int math=sc.nextInt();
       System.out.println("Enter Your Science Mark");
       int science=sc.nextInt();
       System.out.println("Enter Your Social Science Mark");
       int SocialScience=sc.nextInt();      
       //we need the final result mark so,we are calling the calculatemarks method
       System.out.println("What do you want,Check Result and avarage or Check Avarge");
       String studentChoice=sc.next();
       if(studentChoice.equals("Result&Avarage")) {
       int result=calculateMarks(math,science,SocialScience);
       calculateAvarage(result);
       }
       else {
    	   calculateAvarage(math, science, SocialScience);
       }
	}
	
	public static int calculateMarks(int math,int science,int socialScience) {
		int total=math+science+socialScience;
		return total;
	}
	public static void calculateAvarage(int result) {
		 float avarage=result/3;
		 System.out.println(avarage);
		 if(avarage<=40) {
			 System.out.println("Sorry to say this you are Fail");
		 }
		 else {
			 System.out.println("Congrats You are pass");
		 }
		return;
	}
	public static void  calculateAvarage(int math,int science,int socialScience) {
		int marks=math+science+socialScience;
		float result=marks/3;
		System.out.println("This is your Final Score:"+result);
	}

}
