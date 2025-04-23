package Oops;

import java.util.Scanner;


public class BankIob {
	private String accountname;
	private double accountnumber;
	private double balance;
	static String bankname="iob";
	
	BankIob(String accountname,double accountnumber,double balance){
		this.accountname=accountname;
		this.accountnumber=accountnumber;
		this.balance=balance;
	}
	
	public void withdraw(double amount) {
		if(amount<2500) {
		this.balance-=amount;
		}
		else {
			System.err.println("Insuffient Balance");
		}
	}
	public void depositmoney(double amount) {
		this.balance+=amount;
	}
	public void changepin() {
		
	}
	public void setaccountname(String accountname) {
		this.accountname=accountname;	
	}
	public void setaccountnumber(double accountnumber) {
		this.accountnumber=accountnumber;
	}
	public void setbalance(double balance) {
		this.balance=balance;
	}
	public String getaccountname() {
		return accountname;
	}
	public double getaccountnumber() {
		return accountnumber;
	}
	public double getbalance() {
		return balance;
	}
	public static void main(String[] args) {
		BankIob cus=new BankIob("sathish",22335,8000);
		System.out.println("before changes"+cus.balance);
		cus.balance=10000;
		System.out.println("After changes"+cus.balance);
	}
	
}
