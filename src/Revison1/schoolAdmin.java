package Revison1;

import java.util.Scanner;

public class schoolAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		//get the number of students
		int numberOfStudents=sc.nextInt();
		//create an array to store the numberofstudents marks
		int []marks=new int[numberOfStudents];
		for(int i=0;i<marks.length;i++) {
			System.out.println("enter"+i+"Student mark");
			marks[i]=sc.nextInt();
		}
		System.out.print("All Marks:");
	   for(int j=0;j<marks.length;j++) {
		   System.out.print(marks[j]+",");
	   }
	   System.out.println(" ");
	   calculateTotalMarks(marks);
	   calculateAverage(marks,numberOfStudents);
	   findHighestNumber(marks);
	   findLowestNumber(marks);
	   findPassedStudents(marks);
	   findFailedStudents(marks);
	}
	public static void calculateTotalMarks(int marks[]) {
		int total=0;
		for(int mark:marks) {
			total+=mark;	
		}
		System.out.print("Total:"+total);
	}
	public static void calculateAverage(int marks[],int numberOfStudents) {
		double total=0;
		for(int mark:marks) {
			total+=mark;	
		}
		total/=numberOfStudents;
		System.out.println("");
		System.out.print("Avarage:"+total);
	}
	public static void findHighestNumber(int marks[]) {
		int highestNumber=0;
		for(int mark:marks) {
			if(mark>highestNumber) {
				highestNumber=mark;
			}
		}
		System.out.println("");
		System.out.println("Highest:"+highestNumber);
	}
	public static void findLowestNumber(int marks[]) {
		int lowestNumber=marks[0];
		for(int mark:marks) {
			if(mark<lowestNumber) {
				lowestNumber=mark;
			}
		}
		System.out.println("Lowest:"+lowestNumber);
	}
	public static void findPassedStudents(int marks[]) {
		System.out.print("passed students:");
		for(int mark:marks) {
			if(mark>=40) {
				System.out.print(mark+" ");
			}
		}
		System.out.println();
	}
	public static void findFailedStudents(int marks[]) {
		System.out.print("Failed students:");
		for(int mark:marks) {
			if(mark<=40) {
				System.out.print(mark+" ");
			}
		}
	}

}
