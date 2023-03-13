package com.java.customizedexception;
class Jspiders extends Exception
{
	public Jspiders(String msg) 
	{
		super(msg);
	}
}
public class Customized 
{
	public static void check() throws Jspiders
	{
		throw new Jspiders("welcome to my exception");  //super(msg);
	}
	public static void main(String[] args) 
	{
     try 
     {
		check();
	 }
     catch (Jspiders e) 
     {
         e.printStackTrace();
        // System.out.println(e.getMessage());
        // System.out.println("handelled");
	}
	}

}
