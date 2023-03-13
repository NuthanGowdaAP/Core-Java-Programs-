package com.java.compiltime;

public class FamilyName
{
public void surname(String name) 
{
	System.out.println(name +" Kalasa");
}
public void surname(String name,int a) 
{
	System.out.println(name +" Kalasa");
}
public void surname(String name,double d ) 
{
	System.out.println(name +" Kalasa");	
}
public static void main(String[] args) 
	{
		FamilyName m=new FamilyName();
		m.surname("manju");
		m.surname("basu",1);
		m.surname("jyoti",1.1);
}
}