package com.edubridge.generic;
/* program to demonstate on Generic */
class Citizen<T>
{
	//where T defines any kind of Type-values
	T str;
	T str1;
	void print(T str, T str1)
	{
		this.str=str;
		this.str1=str1;
		System.out.println("The values is: "+str+" "+str1);
	}
}
//driver class
public class GenericClassDemo {

	public static void main(String[] args)
	{
		Citizen<String> c= new Citizen<>();
		c.print("Nagpur","Indian");

	}

}
