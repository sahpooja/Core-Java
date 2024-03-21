package com.edubridge.oopsdemo;

public class DriverForBankAccount {

	public static void main(String[] args) 
	{
		SavingAccount o= new SavingAccount();
		o.balance=9000;
		o.deposit(900);
		o.Withdraw(900, 110);

	}

}
