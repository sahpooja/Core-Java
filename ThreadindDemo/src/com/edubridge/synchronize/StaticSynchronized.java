package com.edubridge.synchronize;

public class StaticSynchronized 
{
	public synchronized static void display(String str)
	{
	for(int i=1;i<=3;i++)
	{
		System.out.println("Welcome to EduBridge!");
		System.out.println(str);
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
  }
}
