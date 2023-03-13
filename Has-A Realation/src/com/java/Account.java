package com.java;
public class Account
{
	long accno;
	double bal;
	String branch;
	String ifsc;
	public Account(long accno, double bal, String branch, String ifsc)
	{
		this.accno = accno;
		this.bal = bal;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println("current bal:"+ bal);
	}
	public void withdraw(double amt)
	{
		if(bal>amt)
		{
			bal=bal-amt;
			System.out.println("current bal:"+ bal);	
		}
		else
		{
			System.out.println("insufficient bal");
		}
	}
	public void checkbal()
	{
		System.out.println("current bal:"+bal);
	}
}
