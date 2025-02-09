package W3School;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operator {
    
	String add;
	String sub;
	String mul;
	String div;
	public static void main(String[] args) {
     Operator obj1=new Operator();
     obj1.add="+";
     obj1.sub="-";
     obj1.mul="*";
     obj1.div="%";
     Operator obj2=new Operator();
     obj2.add="+";
     obj2.sub="-";
     obj2.mul="*";
     obj2.div="%";
     
     
     if(obj1==obj2) {
    	 System.out.println("==");
     }
     else {
    	 System.out.println("not ==");
     }
     
     if(obj1.equals(obj2)) {
    	 System.out.println("Yes ==");
     }
     else {
    	 System.out.println(" obj is not ==");
     }
       
	}

}
