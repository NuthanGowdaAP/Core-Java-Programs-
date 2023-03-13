	package com.java.thread;
	public class  Sample1 extends Thread
	{
	@Override
	public void run()
	{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		try
		{
			Sample1.sleep(2000);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}
	 public static void main(String[]arge)
	 {
		 Sample1 s11=new Sample1();
				 s11.start();
	 }
	}
