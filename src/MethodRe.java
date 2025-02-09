
public class MethodRe {
	
	
	
	String Firstname;
	String Lastname;
	String Gmail;
	int Phone;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRe User1=new MethodRe();
		User1.Firstname="kassy";
		User1.Lastname="vinayak";
		User1.Gmail="KassyVinayak@gmail.com";
		User1.Phone=636933725;
		User1.Login(User1.Firstname,User1.Gmail);
	}
  public void Login(String Firstname, String Gmail ) {
	  if(Firstname=="kassy"&&Gmail=="KassyVinayak@gmail.com") {
		  System.out.println("Welcome Back:"+Firstname);
	  }
	  else {
		  System.out.println("Failed To Login..!");
	  }
  }
}
