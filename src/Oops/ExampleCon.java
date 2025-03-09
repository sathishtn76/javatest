package Oops;

public class ExampleCon {
	
	String firstname;
	String lastname;
	int rollno;
	static int count=0;
	ExampleCon(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleCon obj1=new ExampleCon();
		ExampleCon obj2=new ExampleCon();
		
	}

}
