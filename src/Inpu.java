import java.util.Scanner;

public class Inpu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Your  Name?");
        String name= Sc.nextLine();
        System.out.println("Enter Your  Age?");
        int Age=Sc.nextInt();
        System.out.println("Your Name is " +name);
        System.out.println("Your Age is " +Age);
        if(Age>=18) {
        	 System.out.println(Age + " Now You Are The Adult ");	
        }
        else {
        	System.out.println(Age + " No you Not Are The Adult ");	
        }
        
	}

}
