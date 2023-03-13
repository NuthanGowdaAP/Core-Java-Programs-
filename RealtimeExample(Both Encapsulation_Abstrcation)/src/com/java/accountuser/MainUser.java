package com.java.accountuser;

import com.java.accountdetails.Account;
import com.java.accountdetails.Transaction;

public class MainUser {

	public static void main(String[] args) 
	{
	Account a1=new Account("manju",7795543450l,50000);
	Transaction t=new Transaction();
    ServiceTransaction s=new  ServiceTransaction();
    User u1=s.login(1111);
    u1.Transcation(15000, a1, 2);  //double amt,Account a1,int choice
    User u2=s.login(2222);
    u2.Transcation(2000, a1, 1);
    User u3=s.login(3333);
    u3.Transcation(1000, a1, 2);
    t.checkbal(a1);
	}
}
// 1111-ATM---------->1.deposite 2.withdraw 3.checkBal
// 2222-PhonePay---------->1.Reveive 2.send 3.checkBal
// 3333-Gpay else invalid Choise---------->1.Reveive 2.send 3.checkBal
