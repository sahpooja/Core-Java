package com.edubridge.interfaces;
/*Program to demonstrate on reference to a Instance method*/
public class LearnerImplementation 
{
    public void learnJava()
    {
    	System.out.println("Mockito with Junit-5");
    }
    
    public static void main(String[]srgs)
    {
    	LearnerImplementation l1= new LearnerImplementation();
    	Leraner l=l1::learnJava;
    	l.learn();
    }
}
