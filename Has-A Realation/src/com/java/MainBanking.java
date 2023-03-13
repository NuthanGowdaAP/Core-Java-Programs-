package com.java;

public class MainBanking {
public static void main(String[] args) 
{
Customer c=new Customer("manju",7795543450l,"c123");
Account a1=new Account(12345666l,2000,"bgk0","ifsc123");
c.checkbalToAccount(a1);
System.out.println("----------------------");
c.depositToAccount(3000, a1);
System.out.println("----------------------");
c.withdrawToAccount(1000,a1);
System.out.println("----------------------");
c.checkbalToAccount(a1);
}
}
