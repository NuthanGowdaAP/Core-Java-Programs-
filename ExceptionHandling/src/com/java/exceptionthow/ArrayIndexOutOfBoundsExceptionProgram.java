package com.java.exceptionthow;

public class ArrayIndexOutOfBoundsExceptionProgram
{
   public static void array(int[] a)
   {
	   int[] b=new int[a.length];
	   for(int i=0;i<=a.length-1;i++)
	   {
		   b[i]=a[i];
	   }
	   System.out.println(b[5]);
   }
	public static void main(String[] args)
	{
		int[]a= {1,2,3,4,5};
		array(a);
	}

}

