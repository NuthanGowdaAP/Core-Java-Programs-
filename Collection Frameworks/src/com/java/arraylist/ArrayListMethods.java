package com.java.arraylist;

import java.util.ArrayList;

public class ArrayListMethods
{
	public static void main(String[] args) 
	{
     ArrayList<Integer> a=new ArrayList<Integer>();
     // add(elements)
     a.add(1);
     a.add(3);
     a.add(5);
     a.add(8);
     a.add(4);
     System.out.println(a);
     //addAll(index,elements)
     a.add(0,65);
     a.add(3,null);
     a.addAll(0,a);
     System.out.println(a);
     //size();       // finding length of the array
     System.out.println(a.size());
     //isEmpty()
     System.out.println(a.isEmpty());     
     // remove(index)
     a.remove(0);
    // a.removeAll(a);
     //size();
     System.out.println(a.size());
     System.out.println(a);
     // clear()
     a.clear();
     System.out.println("clear Array"+a);
     System.out.println(a.isEmpty());
     //size();
     System.out.println(a.size());
     System.out.println(a);
  }
}