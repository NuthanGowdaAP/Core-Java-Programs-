package com.java.hashset;

import java.util.HashSet;
public class HashSetExample 
{

	public static void main(String[] args) 
	{
	HashSet<Object> h1 =new HashSet<Object>();
	h1.add(1);
	h1.add(3);
	h1.add(null);
	h1.add('A');
	h1.add(1);
	h1.add(null);
	h1.add(45);
	h1.add("manju");
    System.out.println(h1);
     h1.forEach(Obj -> System.out.println(Obj));
//    Iterator<Object> i1=h1.iterator();       // it is used for all collections
//	 while(i1.hasNext())
//	 {
//		 System.out.println(i1.next());
//	 }
	}
}
