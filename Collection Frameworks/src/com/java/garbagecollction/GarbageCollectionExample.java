package com.java.garbagecollction;

public class GarbageCollectionExample {

	@Override
	public void finalize()  // before going to garbage collector first finalize() method will be executed
	{
		System.out.println("object removing");
	}
	public static void main(String[] args)
	{
		GarbageCollectionExample g=new GarbageCollectionExample();
	    g=null;
		System.gc();
		System.out.println("object removed");	
	}

}
