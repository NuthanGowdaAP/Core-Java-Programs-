package com.java.customizedexception;
class Manjunath extends Exception
{
	public Manjunath(String msg) 
	{
		super(msg);
	}
}
public class Customized1 
{
	public static void check() throws Manjunath
	{
		throw new Manjunath("welcome to my second exception");
	}
	public static void main(String[] args) 
	{
     try 
     {
		check();
	 }
     catch (Manjunath e) 
     {
         e.printStackTrace();
         System.out.println(e.getMessage());
         System.out.println("Exception Handelled");
      	}
	}

}
