package com.java.thread;
public class  Sample extends Thread
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
	 Sample s1=new Sample();
			 s1.start();
 }
}
