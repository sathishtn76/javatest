import java.util.Scanner;



public class CoNl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int A=sc.nextInt();
		while(A>=0) {
			if(A%10==0) {
				System.out.println(A);
				break;
			}
			A--;
		}

	}

}
