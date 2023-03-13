package com.java.thread;
public class Demo1 implements Runnable
{
@Override
public void run()
{
for(int i=1;i<=5;i++)
{
	System.out.println(i);
	try
	{
		Thread.sleep(3000);
	}
	catch (InterruptedException e)
	{
		e.printStackTrace();
	}
}
}
 public static void main(String[]arge)
 {
	 Demo1 d11=new Demo1();
	 Thread t1=new Thread(d11);
			 t1.start();
 }
}
