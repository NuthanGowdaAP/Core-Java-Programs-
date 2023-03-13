package com.java.exceptionthow;

public class ArithmeticExceptionProgram
{
   public static void divide(int a) throws Exception
   {
	   int res=1000/a;
	   System.out.println(res);
   }
	public static void main(String[] args) throws Exception
	{
	divide(1);
	divide(0);
	divide(2);
	}
}
