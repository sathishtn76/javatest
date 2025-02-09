
public class SuperMarket {
	
	String Prod_name;
	int price,discount;
	
	SuperMarket(String Prod_name,int price,int discount){
		this.Prod_name=Prod_name;
		this.price=price;
		this.discount=discount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket prod1=new SuperMarket("soap",25,5);
//		prod1.Prod_name="soap";
//		prod1.price=25;
//		prod1.discount=5;
		SuperMarket prod2=new SuperMarket("shampoo",2,0);
//		prod2.Prod_name="shampoo";
//		prod2.price=2;
//		prod2.discount=0;
		SuperMarket prod3=new SuperMarket("biscuit",10,2);
//		prod3.Prod_name="biscuit";
//		prod3.price=10;
//		prod3.discount=2;
		
		prod1.sell();
		System.out.println("..........");
		prod2.sell();
		System.out.println("..........");
		prod3.sell();
		System.out.println("..........");
	}
	public  void sell() {
		System.out.println("product_name:"+Prod_name);
		System.out.println("price:"+price);
		System.out.println("discount:"+discount);
	}

}
