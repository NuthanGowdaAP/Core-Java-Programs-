package com.java.runtime;
class Animals
{
	public void move()
	{
		System.out.println("I can move");
	}
}
class Cats extends Animals
{
	@Override
	public void move()
	{
		System.out.println("I can walk");
	}
}	
class Bird extends Animals
	{
		@Override
		public void move()
		{ 
			System.out.println("I can Fly");
		}
	}
class Fish extends Animals
		{
			@Override
			public void move()
			{
				System.out.println("I can swim");
			}
}
public class AnimalMove
{
	public static void main(String[] args) 
	{
		Animals a=new Fish(); // up cating
		a.move();
		Animals a1=new Bird(); // up cating
		a1.move();
		Animals a2=new Cats(); // up cating
		a2.move();
	}
}