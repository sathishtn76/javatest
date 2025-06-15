package W3School;

import java.lang.classfile.constantpool.FieldRefEntry;
import java.util.ArrayList;
import java.util.Scanner;

import Oops.son;

public class Student {
	String FirstName;
	String LastName;
	int Mark;

	Student(String FirstName, String LastName, int Mark) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Mark = Mark;
	}

	public static void main(String[] args) {
		ArrayList<Student> Students = new ArrayList<>();
		Scanner obj = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("\n1. Add Student");
			System.out.println("2. Show All Students");
			System.out.println("3. Find Highest Mark Student");
			System.out.println("4. Search by First Name");
			System.out.println("5. Remove Student");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = obj.nextInt();
			obj.nextLine(); // To consume newline after nextInt()

			switch (choice) {
			case 1:
				boolean flag = true;
				while (flag) {
					System.out.print("Enter your First Name: ");
					String firstname = obj.nextLine();

					System.out.print("Enter your Last Name: ");
					String lastname = obj.nextLine();

					System.out.print("Enter your Mark: ");
					int mark = obj.nextInt();
					obj.nextLine(); // consume newline

					Students.add(new Student(firstname, lastname, mark));
					System.out.println("Successfully added!");

					System.out.print("Do you want to add another student? (yes/no): ");
					String option = obj.nextLine();
					if (option.equalsIgnoreCase("no")) {
						flag = false;
					}
				}
				break;

			case 2:
				if (Students.size() > 0) {
					System.out.println("\nAll Students:");
					for (Student s : Students) {
						System.out.println(s.FirstName + " " + s.LastName + " - " + s.Mark);
					}
				} else {
					System.out.println("No students to show.");
				}
				break;
			case 3:
				int max = 0;
				for (Student s : Students) {
					if (s.Mark > max) {
						max=s.Mark;
					}
				}
				System.out.println("Maximum Mark is:"+max);
				break;
			case 4:
				System.out.print("Enter name to search:");
				String inputname=obj.next();
				for (Student s : Students) {
					if(s.FirstName.contains(inputname)) {
						System.out.println(s.FirstName + " " + s.LastName + " - " + s.Mark);
					}
				}
				break;
			case 5:
				for(int i=0;i<Students.size();i++) {
					if(Students.get(i).FirstName.equals("sathish")) {
						System.out.print("removed student:"+Students.remove(i).FirstName);
					}
				}
				break;
			case 6:
				run = false;
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice!");
			}
		}

	}
}
