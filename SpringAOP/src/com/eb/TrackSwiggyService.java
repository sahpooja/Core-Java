package com.eb;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackSwiggyService 
{
    @Pointcut("execution(* Swiggy.*(..))")
    public void vegMenu() {}
    
    @Before("vegMenu()")
    //@After("vegMenu()")
    //@Around("vegMenu()")
    public void Suggestion(JoinPoint p)
    {
    	System.out.println("This is Additional Method");
    }
    
}
