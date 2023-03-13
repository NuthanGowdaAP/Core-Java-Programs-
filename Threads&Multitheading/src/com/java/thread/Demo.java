package com.java.thread;
public class Demo implements Runnable
{
@Override
public void run()
{
for(int i=1;i<=5;i++)
{
	System.out.println(i);
}
}
 public static void main(String[]arge)
 {
	 Demo d1=new Demo();
	 Thread t1=new Thread(d1);
			 t1.start();
 }
}
