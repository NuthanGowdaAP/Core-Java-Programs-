package com.java.exceptionthow;
class A2
{
public  void test()
	{
		System.out.println("test(); of A2 superclass ");
	}
}
class B2 extends A2
{
	public void count()
	{
		System.out.println("coutn(); of B2 subclass");
	}
}
class C2 extends A2
{
	public void display()
	{
		System.out.println("display(); of C3 subclass");
	}
}
public class ClassCastExceptionProgram
{
	public static void main(String[] args) 
	{
	 B2 b=new B2();    // UpCasting
     A2 a=b;
     a.test();
     System.out.println("------------------------------");
     B2 b1=(B2)a;     //DownCasting (Upcasting is Mandatory)
     b1.test();
     b1.count();
     System.out.println("-------------ClassCastException-----------------");
     C2 c=(C2)a;     //Directly doing DownCasting but not done upcasting it is ClassCastException
     c.test();       //JVM wiil throw error
     c.display();
	}
}

