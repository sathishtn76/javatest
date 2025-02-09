import java.util.Scanner;

public class Rela {

	public static void main(String[] args) {
		Scanner Marks=new Scanner(System.in);
	       System.out.println("Enter Your Marks");
	       int mark=Marks.nextInt();
	       
	       
	       switch(mark) {
	       case 90:{
	    	   System.out.println("Congralations you are the Topper Of University:" + mark);
	    	   break;
	       }
	       case 80:{
	    	   System.out.println("verygood performance ..keep it touch :" + mark);
	    	   break;
	       }
	       case 70:{
	    	   System.out.println("good performance ..keep it touch :" + mark);
	    	   break;
	       }
	       case 60:{
	    	   System.out.println("Average performance give your best :70" + mark);
	    	   break;
	       }
	       default :{
	    	   System.out.println("your performance is worst  bring your parents");
	       }
	       
	       }
	}

}
