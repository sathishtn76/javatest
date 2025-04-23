package Revison1;

import java.util.Scanner;

public class Employye_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Employees You Want To Add");
		//to store how many employees to add
		int totalEmployees=sc.nextInt();
		//create an EmployeAdd class object inside the array
		EmployeAdd[] employees=new EmployeAdd[totalEmployees];
		//using loop to get&set the employee details
		for(int i=0;i<totalEmployees;i++) {
			System.out.println("Enter the "+(i+1)+ "Employee name");
			String name=sc.next();
			System.out.println("Enter the "+(i+1)+ "Employee department");
			String department=sc.next();
			System.out.println("Enter the "+(i+1)+ "Employee salery");
			double salary=sc.nextDouble();
			System.out.println("Enter the "+(i+1)+ "Employee category");
			String category=sc.next();
			employees[i]=new EmployeAdd(name,department,salary,category);
			employees[i].details();
		}
		EmployeAdd.totalEmployess();
		EmployeAdd.checkHighestPaidEmployee(employees);
		EmployeAdd.AverageSalery(employees);
		
	}
 

}
