package com.java.accountuser;

public class ServiceTransaction
{
	User u;
public User login(int pin)
{

	switch(pin)
	{
	case 1111:  u=new ATM();
	return u;
	case 2222: 
	return u=new PhonePay();
	case 3333:
	return u=new GPay();
	default :System.out.println("intvalid Bank user");
	break;
	}
	return u;
}
}