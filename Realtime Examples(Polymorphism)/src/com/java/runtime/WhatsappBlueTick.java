package com.java.runtime;
class Whatsapp1
{
	public void deliveryreport()
	{
		System.out.println("single tick");
	}
}
class Whatsapp2 extends Whatsapp1
{
	@Override
	public void deliveryreport()
	{
		//super.deliveryreport();
		System.out.println("double tick");
	}
}
class Whatsapp3 extends Whatsapp2
{
	@Override
	public void deliveryreport()
	{
		//super.deliveryreport();
		System.out.println("blue tick");
	}
}

public class WhatsappBlueTick
{
	public static void main(String[] args) {
		Whatsapp1 w1=new Whatsapp2();
		w1.deliveryreport();
		
		Whatsapp1 w2=new Whatsapp3();
		w2.deliveryreport();
	}

}
