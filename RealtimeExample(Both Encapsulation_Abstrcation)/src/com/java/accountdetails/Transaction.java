package com.java.accountdetails;

public class Transaction
{
	
public void deposit(double amt,Account a1)
{
 	a1.setBal(amt+a1.getBal());
 	System.out.println(a1.getBal());
}
public void withdraw(double amt,Account a1)
{
	if(a1.getBal()>amt)
	{
		a1.setBal(a1.getBal()-amt);
		System.out.println(a1.getBal());
	}
	else
	{
		System.out.println("insufficient balence");
	}
}
public void checkbal(Account a1)
{
	System.out.println(	a1.getBal());	
}
}
