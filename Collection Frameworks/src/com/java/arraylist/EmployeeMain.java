package com.java.arraylist;
import java.util.ArrayList;
import java.util.Collections;
public class EmployeeMain 
{
	public void addemp()
	{
	Employee e1=new Employee("name1", 101,20000);
	Employee e2=new Employee("name2", 102,21000);
	Employee e3=new Employee("name3", 103,22000);
	Employee e4=new Employee("name4", 104,23000);
    ArrayList<Employee> emplist =new ArrayList<Employee>();
	 emplist.add(e2);
	 emplist.add(e4);
	 emplist.add(e1);
	 emplist.add(e1);
	 emplist.add(e3);
	 System.out.println(emplist);
	 Collections.sort(emplist);  // ascending order
	// Collections.sort(emplist,Collections.reverseOrder()); // decending order
	 for(int i=0;i<emplist.size();i++)
     {
    	 System.out.println(emplist.get(i));
     }
	 
//	 Iterator<Employee> i1=emplist.iterator();
//	 while(i1.hasNext())
//	 {
//		 System.out.println(i1.next());
//	 }
	}
	public static void main(String[] args)
	{
		EmployeeMain m1=new EmployeeMain();
		m1.addemp();
	}

}
