
public class Encap {
  private int Accno;
  private  String Accname;
  private double Bal;
  
  Encap(int Accno,String Accname,double Bal){
	  this.Accno=Accno;
	  this.Accname=Accname;
	  this.Bal=Bal;
  }
  public String getAccname() {
	  return Accname;
  }
  public double getBal() {
	  return Bal;
  }
  public int  getAccno() {
	  return Accno;
  }
  public double Withdraw(double Amount) {
	  if(Amount<=4000) {
		  Bal=Bal-Amount;  
	  }
	  
	  return Bal;
	  
  }

   
}
