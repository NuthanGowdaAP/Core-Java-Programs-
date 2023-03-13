package com.java.hashset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class EmployeeMain 
{
	public void addemp()
	{
	Employee e1=new Employee("name1", 101);
	Employee e2=new Employee("name2", 102);
	Employee e3=new Employee("name3", 103);
	Employee e4=new Employee("name4", 104);
	HashSet<Employee> emplist =new HashSet<Employee>();
	 emplist.add(e2);
	 emplist.add(e1);
	 emplist.add(e3);
	 emplist.add(e1);
	 emplist.add(e2);
	 emplist.add(e4);
	 System.out.println(emplist);
	 ArrayList<Employee> emp =new ArrayList<Employee>(emplist);
	 Collections.sort(emp);
	 for(int i=0;i<emp.size();i++)
     {
    	 System.out.println(emp.get(i));
     }
	}
	public static void main(String[] args)
	{
		EmployeeMain m1=new EmployeeMain();
		m1.addemp();
	}

}
