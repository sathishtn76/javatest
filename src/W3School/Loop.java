package W3School;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;



public class Loop {

	public static void main(String[] args) {
		
    Scanner Sc=new Scanner(System.in);
    System.out.println("Which State...You Want Land");
    boolean flags=true;
    while(flags) {
    	String value1=Sc.nextLine();
    	switch(value1) {
    	case "Tamilnadu":
    		System.out.println("Welcome To Tamilnadu...Which DIstrict");
    		String[] districts = {"Tenkasi", "Thirunelveli", "Madurai", "Chennai"};
    		int i=0;
    		while(i<districts.length){
    			System.out.println(districts[i]);
    			i++;
    		}
    		System.out.println("Select Your District");
    		String DisName=Sc.nextLine();
    		switch(DisName) {
    		case "Tenkasi":
    			String[] cities = {"Tenkasi", "Kadayanuler", "Kodikurichi", "IT"};
    			while(i<cities.length) {
    				System.out.println(cities[i]);
    			}
    			System.out.println("Select Your Cities");
    			String CityName=Sc.nextLine();
    			if(flags) {
    				System.out.println("Are You Sure If You Want Land Form "+CityName);
    			}
    			
    			break;
    		case "Thirunelveli":
    			break;
    		case "Madurai":
    			break;
    		case "Chennai":
    			break;
    		}
    		break;
    	case "Bihar":
    		System.out.println("Welcome to Bihar");
    		flags=false;
    		break;
    	case "Punjab":
    		System.out.println("Welcome To Punjab");
    		flags=false;
    		break;
    	default:
    		System.err.println("Invalid State");
    		break;
    	}
    }
    
	}

}
