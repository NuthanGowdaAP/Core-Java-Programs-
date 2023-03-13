package com.java.accountuser;
import com.java.accountdetails.Account;
import com.java.accountdetails.Transaction;
public class ATM implements User
{
	Transaction t1=new Transaction();
	@Override
	public void Transcation(double amt,Account a1,int choice)
	{
		Transaction t1=new Transaction();
		switch(choice)
		{
		case 1:t1.deposit(amt, a1);
		break;
		case 2:t1.withdraw(amt, a1);
		break;
		case 3:t1.checkbal(a1);
		break;
		default:System.out.println("invalid choice");
		}
	}
	 
}
