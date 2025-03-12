package Oops;

public class Animal {
	int leg;
	int height;
	int width;
	String brainsence;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal1=new Animal();
        animal1.hunting();
        animal1.savingforest();
	}
	public void hunting() {
		System.out.println("Hunditing Animals");
	}
	public void savingforest() {
		System.out.println("saving forsest");
	}

}
