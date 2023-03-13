package com.java.exceptionhandlingtryandcatch;
public class ArithmeticExceptionHandling
{
   public static void divide(int a)
   {
	   try
	   {
	   int res=1000/a;
	   System.out.println(res);
	   }
	   catch(ArithmeticException e)
	   {
		  System.out.println("exception handelled");
		  //System.out.println(e.getMessage());
	   }
   }
	public static void main(String[] args)
	{
	divide(1);
	divide(0);
	divide(2);
	}

}