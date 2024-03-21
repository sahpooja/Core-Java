package com.edubridge.synchronize;

public class BlockA extends Thread
{
    Flat m1;
    
    public BlockA( Flat m1)
    {
   	 super();
   	 this.m1=m1;
    }
    public void run()
    {
   	 m1.print(10);
    }
}
