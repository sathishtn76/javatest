package Oops;

import java.time.LocalDate;

public class Cla_Obj {
	 String brand;
	    int speed;
	    Cla_Obj(){
	    	   brand = "Toyota";
	           speed = 100;
	           System.out.println("Car Object Created!");
	    }
	    
	    void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed + " km/h");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cla_Obj myCar = new Cla_Obj(); // Constructor is called automatically
//	        myCar.displayInfo();
	        LocalDate today = LocalDate.now(); // Using Java API
	        System.out.println(today);
	}

}
