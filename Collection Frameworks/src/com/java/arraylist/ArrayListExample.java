package com.java.arraylist;

import java.util.ArrayList;

public class ArrayListExample 
{
	public static void main(String[] args) 
	{
     ArrayList<Object> alist =new ArrayList<Object>();
     System.out.println(alist);
     alist.add(1);
     alist.add(null);
     alist.add(1);
     alist.add(6);
     alist.add(6);
     alist.add(null);
     System.out.println(alist);
     alist.remove(3);
//     System.out.println("------");
//     alist.removeAll(alist);
     System.out.println(alist);
     for(int i=0;i<alist.size();i++)
     {
    	 System.out.println(alist.get(i));
     }
     }

}
