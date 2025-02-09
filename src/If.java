import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Marks=new Scanner(System.in);
       System.out.println("Enter Your Marks");
       int mark=Marks.nextInt();
       
       if(mark>=90) {
    	   System.out.println("Congralations you are the Topper Of University:" + mark);
       }
       else if (mark>=80) {
    	   System.out.println("Now your performance is verygood:" + mark);
	   }
       else if (mark>=70) {
    	   System.out.println("Now your performance is good:" + mark);
       }
       else if (mark>=60) {
    	   System.out.println("Now your performance is Average:" + mark);
       }
       
       
       
       
	}

	

}
