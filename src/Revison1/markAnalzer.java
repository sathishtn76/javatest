package Revison1;

import java.util.Scanner;

public class markAnalzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] numberOfStudents = { "Student1", "Student2", "Student3", "Student4", "Student5" };
		int marks[] = new int[5];
		for (int i = 0; i < numberOfStudents.length; i++) {
			System.out.println("Enter your marks from " + numberOfStudents[i]);
			marks[i] = sc.nextInt();
		}
		int i = 0;
		while (i < marks.length) {
			System.out.print(marks[i] + ",");
			i++;
		}
		System.out.println();
		// Find and print highest mark
		int highestMark = marks[0];
		for (int j = 1; j < marks.length; j++) {
			if (marks[j] > highestMark) {
				highestMark = marks[j];
			}
		}
		System.out.println("Highest mark is: " + highestMark);
		
		
		// Find and print highest mark
        int lowestMark = marks[0];
        for (int j = 1; j < marks.length; j++) {
            if (marks[j] < lowestMark) {
            	lowestMark = marks[j];
            }
        }
        System.out.println("lowestMark mark is: " + lowestMark);
	}

}
