package com.edubridge.oopsdemo;
//program on Inheritance
//parent class
public class BankAccount
{
    int balance;
    int amount;
    int money;
    
    //method deposit
    protected void deposit(int amount)
    {
      this.amount =amount;
      System.out.println("Amount deposit is: "+amount);
    }
    
    
    void Withdraw (int money, int balance)
    {
    	this.balance=balance;
    	this.money=money;
    	
    	if(balance>100)
    	{
    		System.out.println("Withdraw Money"+money);
    	}
    	else
    	{
    		System.out.println("Your balance is low");
    	}
    }
}
