package Revison1;

import java.util.Scanner;

public class basicsIf {
	
  int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("welcome To Our Best CalCulator");
	    System.out.println("Enter your Numbers");
	    int firstNumber=sc.nextInt();
	    int secondNumber=sc.nextInt();
	    System.out.println("please confirm your actions +,-,*,/");
	    sc.nextLine();
	    String userChoice=sc.nextLine();
	    switch(userChoice) {
	    case "+":
	    	int result=firstNumber+secondNumber;
	    	System.out.println("result is"+result);
	    	break;
	    case "-":
	    	break;
	    case "*":
	    	break;
	    case "/":
	    	break;
	    }
	    

	}

}
