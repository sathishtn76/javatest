package Oops;

public class Emplyee {
	 private String name;
	    private int age;
	    private double salary;

	    // Public getter and setter methods for name
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Public getter and setter methods for age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        if (age > 0) { // Validation can be added in setter methods
	            this.age = age;
	        }
	    }

	    // Public getter and setter methods for salary
	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) { // Validation can be added in setter methods
	            this.salary = salary;
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyee emp = new Emplyee();
        emp.setName("Sathish");
        emp.setAge(30);
        emp.setSalary(50000.0);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Salary: " + emp.getSalary());

	}

}
