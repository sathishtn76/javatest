package Oops;

import java.util.Scanner;


public class BankIob {
	private String accountname;
	private double accountnumber;
	private double balance;
	static String bankname="iob";
	
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
}
