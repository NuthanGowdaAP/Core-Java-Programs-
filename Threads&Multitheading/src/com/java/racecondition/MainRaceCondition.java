package com.java.racecondition;
 class Task 
{
synchronized public void print()
{
for(int i=1;i<=3;i++)
  {
	System.out.println(i);
   }
}
synchronized public void print1()
{
for(int i=3;i>=1;i--)
  {
	System.out.println(i);
  }
}
}
 class  Thread1 extends Thread
 {
	 Task t1;
	 public Thread1(Task t1)
	 {
		 this.t1=t1;
	 }
 @Override
 public void run()
 {
	 t1.print();
 }
}
 class  Thread2 extends Thread
 {
	 Task t1;
	 public Thread2(Task t1)
	 {
		 this.t1=t1;
	 }
 @Override
 public void run()
 {
	 t1.print1();
 }
}
public class MainRaceCondition
{
	public static void main(String[] args) {
		Task t =new Task();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
	}

}
