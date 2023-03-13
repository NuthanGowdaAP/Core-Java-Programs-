package com.java.threaddeadlock;
class ThreadTask1 extends Thread
{
	String s1;
	String s2;
	public ThreadTask1(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() 
	{
	System.out.println("t1 waiting to lock s1");
	synchronized(s1)
	{
		System.out.println("t1 lock s1");
		System.out.println("t1 waiting to lock s2");
		try 
		{
			System.out.println("t1 pause the execution");
			s1.wait();
			System.out.println("t1 resume the execution");
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	synchronized(s2)
	{
		System.out.println("t1 lock s2");
	}
	System.out.println("t1 unlock s1");
	System.out.println("t1 unlock s2");
	}
	}
}
class ThreadTask2 extends Thread
{
	String s1;
	String s2;
	public ThreadTask2(String s1, String s2) 
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	@Override
	public void run() 
	{
	System.out.println("t2 waiting to lock s2");
	synchronized(s2)
	{
		System.out.println("t2 lock s2");
		System.out.println("t2 waiting to lock s1");
	synchronized(s1)
	{
		System.out.println("t2 lock s1");
		s1.notify();
	}
	System.out.println("t2 unlock s2");
	System.out.println("t2 unlock s1");
	}	
  }
}
public class MainThreadDeadLock
{
	public static void main(String[] args) 
	{
	String str="java";
	String str1="sql";
	ThreadTask1 t1= new ThreadTask1(str,str1);
	ThreadTask2 t2= new ThreadTask2(str,str1);
	t1.start();
	t2.start();

	}

}
