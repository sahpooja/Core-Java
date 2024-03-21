package com.eb;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackSwiggyService 
{
    @Pointcut("execution(*swiggy.*(..))")
    public void vegmenu() {}
    
    @Before("vegMenu")
    public void Suggestion(JoinPoint p)
    {
    	System.out.println("This is Additional Method");
    }
    
}
