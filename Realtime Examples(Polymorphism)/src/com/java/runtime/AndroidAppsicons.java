package com.java.runtime;
class Android
{
	public void homeicons()
	{
		System.out.println(" 5 apps");
	}
}
class  Samsung extends Android
{
	@Override
	public void homeicons()
	{
		System.out.println("10 apps");
	}
}	
class  oneplus extends Android
	{
		@Override
		public void homeicons()
		{ 
			System.out.println(" 6 apps");
		}
	}
class Nokia extends Android
		{
			@Override
			public void homeicons()
			{
				System.out.println("All apps");
			}
}
public class AndroidAppsicons 
{
	public static void main(String[] args) 
	{
		Android a1=new oneplus(); // up cating
		a1.homeicons(); 
	}
}