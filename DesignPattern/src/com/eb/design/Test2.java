package com.eb.design;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) 
	{
		SelectNetworkPlan s2= new SelectNetworkPlan();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the network for which u want to use");
		String networkName=sc.next();
		
		System.out.println("Enter the number of minutes:");
		int min=sc.nextInt();
		
		CellularPlan p=s2.getPlan(networkName);
		System.out.println("Bill amount for "+networkName+" of "+min);
		p.getRate();
		p.processBill(min);

	}

}
