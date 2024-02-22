package com.edubridge.stringtoken;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args)
	{
		StringTokenizer t= new StringTokenizer(""+ " Hey there, I am Using String Tokens");
        System.out.println(t.countTokens());
        System.out.println(t.nextToken());
        System.out.println(t.nextToken());
        
        StringTokenizer t1= new StringTokenizer("Lets try this");
        while(t1.hasMoreTokens())
        {
        	System.out.println(t1.nextToken());
        }
        
        StringTokenizer t2= new StringTokenizer("Java:is:high:programming:language", ":", true);
        while(t2.hasMoreTokens())
        {
        	System.out.print(t2.nextToken());
        }
	}

}
