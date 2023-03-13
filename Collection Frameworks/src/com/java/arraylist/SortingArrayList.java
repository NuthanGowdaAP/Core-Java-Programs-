package com.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList
{
	public static void main(String[] args) 
	{
     ArrayList<Integer> alist =new ArrayList<Integer>();
     alist.add(1);
     alist.add(5);
     alist.add(2);
     alist.add(8);
     alist.add(2);
     System.out.println("befor sorting: "+alist);
      Collections.sort(alist);  // ascending order
   //  Collections.sort(alist,Collections.reverseOrder());  // (first sorting &sorted out in revese order)descending order
     System.out.println("after sorting: "+alist);
     for(int i=0;i<alist.size();i++)
     {
    	 System.out.println(alist.get(i));
     }
  }
}
