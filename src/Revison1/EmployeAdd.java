package Revison1;

public class EmployeAdd {
	String name;
	String department;
	double salary;
	String category;
	static int totalemployees;
	
	
	EmployeAdd(String name,String department,double salary,String category ){
		this.name=name;
		this.department=department;
		this.salary=salary;
		this.category=category;
		this.totalemployees++;
	}
	
	public static void checkHighestPaidEmployee(EmployeAdd employee[]) {
       double max=0;
       for(int i=0;i<employee.length;i++) {
    	   if(employee[i].salary>max) {
    		   max=employee[i].salary;
    	   }
       }
       System.out.println("Highest pai employee:"+max);
	}

	public static void AverageSalery(EmployeAdd employee[]) {
		double total=0;
		for(int i=0;i<employee.length;i++) {
			total+=employee[i].salary;
		}
		total/=employee.length;
		System.out.println("Average:"+total);
	}
	public static void totalEmployess() {
		System.out.println("Total employees"+totalemployees);
	}
	 public void details() {
		 System.out.println("Employee Details:");
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("Salary: " + salary);
	        System.out.println("Category: " + category);
	        System.out.println("---------------------------");
	  }

}
