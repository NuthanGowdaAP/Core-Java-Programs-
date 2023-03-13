package com.java;

public class Customer
{
	String name;
	long mobile;
	String customerid;
	
	Account a1;  // Hash-A ralation(sub class)---->Account dependent on Customer
	public Customer(String name, long mobile, String customerid) 
	{
		this.name = name;
		this.mobile = mobile;
		this.customerid = customerid;
	}
	public void depositToAccount(double amt,Account a1)
	{
		this.a1=a1;
		System.out.println("Depositing amt:"+ amt);
		a1.deposit(amt);
	}
	public void withdrawToAccount(double amt,Account a1)
	{
		System.out.println("withdraw amt bal:"+ amt);	
		a1.withdraw(amt);
	}
	public void checkbalToAccount(Account a1)
	{
		a1.checkbal();
	}
}
