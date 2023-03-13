package com.java.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample1
{

	public static void main(String[] args) 
	{
	HashSet<Integer> h1 =new HashSet<Integer>();
	h1.add(1);
	h1.add(3);
	h1.add(1);
	h1.add(16);
	h1.add(45);
	h1.add(40);
	h1.add(15);
    System.out.println(h1);
    TreeSet<Integer> h11 =new TreeSet<Integer>(h1);  // Heterogeneous elements not posibles(only Intrger valuse)
     h11.forEach(Obj -> System.out.println(Obj));
//    Iterator<Object> i1=h1.iterator();       // it is used for all collections
//	 while(i1.hasNext())
//	 {
//		 System.out.println(i1.next());
//	 }
	}
}
