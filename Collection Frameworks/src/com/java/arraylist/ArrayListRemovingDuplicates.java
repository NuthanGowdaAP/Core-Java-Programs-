package com.java.arraylist;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListRemovingDuplicates
{
	public static void main(String[] args) 
	{
     ArrayList<Object> alist =new ArrayList<Object>();
     HashSet<Object> h1 =new  HashSet<Object>(alist);
     h1.add(1);
     h1.add(2);
     h1.add(6);
     h1.add(null);
     h1.add(6);
     h1.add(null);
     h1.add(3);
     h1.add(4);
     h1.add(6);
     h1.add(4);
     h1.forEach(Obj -> System.out.println(Obj));
     }

}
