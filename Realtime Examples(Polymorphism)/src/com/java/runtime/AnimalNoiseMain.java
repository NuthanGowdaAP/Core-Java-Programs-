package com.java.runtime;

class Animal
{
public void noise()
{
	System.out.println("Animal noise");
}
}
class Dog extends Animal         
	{
		@Override
		public void noise()
		{
			System.out.println("Bow Bow");
		}
	}
class Cat extends Animal         
{
	@Override
	public void noise()
	{
		System.out.println("Meow Meow");
	}
}
	public class  AnimalNoiseMain
	{
		public static void main(String[] args)
		{
			Animal a=new Dog();  // inheritance,overriding,Up cating is complasary
			a.noise();
			Animal a1=new Cat();
			a1.noise();
		}

	}
