
public class Encap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Encap Cus1=new Encap(7253,"sathish",5000);
       System.out.println("WELCOME TO OUR IOB BANK:"+Cus1.getAccname());
       Cus1.Withdraw(5000);
      System.out.println("YOUR BALANCE IS :"+Cus1.getBal()) ;
	}

}
