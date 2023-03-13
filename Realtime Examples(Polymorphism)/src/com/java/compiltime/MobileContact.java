package com.java.compiltime;

public class MobileContact 
{
public void savecontact(String name, long number1)
{
	System.out.println(name+" "+number1);
}
public void savecontact(String name, long number1,long number2)
{
	System.out.println(name+" "+number1+" "+ number2);
}
 public static void main(String[] args) 
 {
	 MobileContact m=new MobileContact();
	 m.savecontact("manju",7795543450l);
	 m.savecontact("manju",7795543450l,7795543450l);
 }
}
