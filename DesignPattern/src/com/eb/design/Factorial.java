package com.eb.design;


class BOI implements Plan
{
	public void getRoi(double rate)
	{
		System.out.println("The rate of Interest for BOI is:"+rate);
	}
}
class SBI implements Plan
{
	public void getRoi(double rate)
	{
		System.out.println("The rate of Interest for SBI is:"+rate);
	}
}
class BOB implements Plan
{
	public void getRoi(double rate)
	{
		System.out.println("The rate of Interest for BOB is:"+rate);
	}
}

public class Factorial {

	public static void main(String[] args) 
	{
		BOI b1=new BOI();
		b1.getRoi(6.5);
		
		SBI s=new SBI();
		s.getRoi(7.5);
		
		BOB b2= new BOB();
		b2.getRoi(8.5);

	}

}
