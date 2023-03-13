package com.java.exceptionhandlingtryandcatch;
public class trywithMultipleCatchBlocks
{
   public static void divide(int a)
   {
	   try
	   {
	   int res=1000/a;
	   System.out.println(res);
	   int[]res1= {1,2,3,4,5};
	   System.out.println(res1[a]);
	   }
//	   catch(ArithmeticException a1)
//	   {
//		   System.out.println("exception  divide");   
//	   }
	   catch(Exception e)
	   {
		   System.out.println("exception handelled");   
	   }
   }
	public static void main(String[] args)
	{
	divide(1);
	divide(0);
	divide(5);
	}

}