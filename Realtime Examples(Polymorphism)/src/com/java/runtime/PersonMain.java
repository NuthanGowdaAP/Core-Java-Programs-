package com.java.runtime;
class Person
{
	public void man()
	{
		System.out.println("acts as a person");
	}
}
class Student extends Person
{
	@Override
	public void man()
	{
		System.out.println("In Colleage acts as a Student");
	}
}	
class Customer extends Person
	{
		@Override
		public void man()
		{ 
			System.out.println("In Shop acts as a Customer");
		}
	}
class Son extends Person
		{
			@Override
			public void man()
			{
				System.out.println("In home acts as a Son");
			}
}
public class PersonMain
{
	public static void main(String[] args) 
	{
		Person a=new Student(); // up cating
		a.man();
		Person a1=new Customer(); // up cating
		a1.man();
		Person a2=new Son(); // up cating
		a2.man();
	}
}