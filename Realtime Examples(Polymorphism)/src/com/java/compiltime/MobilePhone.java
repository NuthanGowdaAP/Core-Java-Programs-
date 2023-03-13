package com.java.compiltime;

public class MobilePhone 
{
public void call() 
{
	System.out.println("voice call");
}
public void call(int a) 
{
	System.out.println("Conference call");
}
public void call(double d ) 
{
	System.out.println("video call");	
}
	public static void main(String[] args) 
	{
		MobilePhone m=new MobilePhone();
		m.call();
		m.call(1);
		m.call(1.1);
}
}