package com.eb.singletone;

import java.sql.SQLException;
import java.util.Scanner;

public class MainSingleton {

	public static void main(String[] args) throws SQLException {
		System.out.println("SingleTone Design Creational Design Pattern");
		Scanner sc=new Scanner(System.in);
		
		InsertSingletone jdbc= InsertSingletone. getInstance();
		
		int choice=0;
		do {
			System.out.println("1.Insert");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Exit");
			System.out.println("Enter  your choice: ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: 
				System.out.println("Enter your Name:");
				
				String uname=sc.next();
				System.out.println("Enter your Password:");
				
				String upass=sc.next();
				System.out.println("Enter your Employee id:");
				
				int eid=sc.nextInt();
				int i=jdbc.insert(uname, upass, eid);
				if(i>0) {
					System.out.println("Data inserted successfully");
				}
				else {
					System.out.println("Data is not inserted ");
				}
				break;
				
			case 2:
				jdbc.view();
				break;
			case 3:
				
				
				System.out.println("Enter the id which u want update:");
				
				int id=sc.nextInt();
				System.out.println("Enter the username which u want update:");
				String uname1=sc.next();
				System.out.println("Enter the password which u want update:");
				
				String pass=sc.next();

				int i1=jdbc.update(uname1, pass,id);
				if(i1>0) {
					System.out.println("Data updated successfully");
				}
				else {
					System.out.println("Data not updated ");
				}
				break;
			case 4:
				System.out.println("Which id u want to delete:");
				
				int id2=sc.nextInt();
				jdbc.delete(id2);
				System.out.println("Id deleted Successfully");
				break;
			case 5:
				System.out.println("Bye");
				break;
			default:
				System.out.println("Wrng choice");
			}
			
				
		}while(choice!=5);
		

	}

}