package Revison1;

import java.util.Scanner;

public class studentGradeAnalzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int numberOfStudents=sc.nextInt();
		String names[]=new String[numberOfStudents];
		int marks[]=new int[numberOfStudents];
		for(int i=0;i<names.length;i++) {
			System.out.println("Enter student " + (i+1) + "name");
			names[i]=sc.next();
			System.out.println("Enter "+names[i]+" mark");
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+"-"+marks[i]);
		}
		checkavaarage(marks);
		CheckTopper(marks,names);
		checkFailedStudents(marks);
	}
	public static void checkavaarage(int marks[]) {
	int total=0;
	for(int i=0;i<marks.length;i++) {
		total+=marks[i];
	}
	float avarege=total/marks.length;
	System.out.println("Class Average:"+avarege);
	}
	public static void CheckTopper(int marks[],String names[]) {
		int max=0;
		for(int i=0;i<names.length;i++) {
//			System.out.println(names[i]+"-"+marks[i]);
			if(marks[i]>max) {
				max=marks[i];
			}
		}
		System.out.println("Topper:"+max);
		
	}
	public static void checkFailedStudents(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<40) {
				System.out.println("Faailed Students:"+marks[i]);
			}
		}
	}

}
