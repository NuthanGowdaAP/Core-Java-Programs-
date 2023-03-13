   package com.java.accountuser;
import com.java.accountdetails.Account;
import com.java.accountdetails.Transaction;
public class GPay implements User
{
	Transaction t1=new Transaction();
	Account a;// Has A Relationship
	@Override
	public void Transcation(double amt,Account a1,int choice)
	{
		this.a=a1;
		Transaction t1=new Transaction();
		switch(choice)
		{
		case 1:
		recive(amt);
		break;
		case 2:
			send(amt);
		break;
		case 3:t1.checkbal(a1);
		break;
		default:System.out.println("invalid choice");
		}
	}
	public void recive(double amt) {
		 
		t1.deposit(amt,  a);
	}
	public void send(double amt) {
		t1.withdraw(amt, a);
	}
	 
}
