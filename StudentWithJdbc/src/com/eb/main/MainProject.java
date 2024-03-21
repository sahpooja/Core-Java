package com.eb.main;

import java.util.Scanner;

import com.eb.dao.StudentDao;
import com.ed.pojo.Student;

public class MainProject {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your Name: ");
		
		String Name= sc.next();
		System.out.println("Welcome to student Management Proptal"+Name);
		
		int ch=0;
		do {
			System.out.println("Press 1 Add Student");
			System.out.println("Press 2 Update Student");
			System.out.println("Press 3 Delete Student");
			System.out.println("Press 4 Read Student Records");
			System.out.println("Press 5 Add Exit");
			
			System.out.println("Enter Choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Student Name: ");
				
				String sname=sc.next();
				System.out.println("Enter Student Contact No.: ");
				
				String contact=sc.next();
				System.out.println("Enter Student City: ");
				
				String city =sc.next();
				
				Student st=new Student(sname,contact,city);
				boolean ans=StudentDao.insertStudentData(st);
				System.out.println("Data inserted successfully");
				break;
				
			case 2:
				System.out.println("Press 1 to Update Name: ");
				System.out.println("Press 2 to Update Contact No: ");
				System.out.println("Press 3 to Update City: ");
				int val=sc.nextInt();
				
				if(val==1)
				{
					System.out.println("Enter name which u want to update: ");
					String name1=sc.next();
					System.out.println("Enter Id: ");
					
					int Id=sc.nextInt();
					Student s1=new Student();
					s1.setStudentName(name1);
					boolean f=StudentDao.updateStudentData(val, name1, Id, s1);
					System.out.println("Name is updated successfully");
				}
				else if(val==2)
				{
					System.out.println("Enter phone no which u want to update: ");
					String cont=sc.next();
					System.out.println("Enter Id: ");
					
					int Id=sc.nextInt();
					Student s1=new Student();
					s1.setStudentName(cont);
					boolean f=StudentDao.updateStudentData(val, cont, Id, s1);
					System.out.println("Contact number is updated successfully");
				}
				else if(val==3)
				{
					System.out.println("Enter City which u want to update: ");
					String city1=sc.next();
					System.out.println("Enter Id: ");
					
					int Id=sc.nextInt();
					Student s1=new Student();
					s1.setStudentName(city1);
					boolean f=StudentDao.updateStudentData(val, city1, Id, s1);
					System.out.println("City is updated successfully");
				}
				else 
				{
					System.out.println("Data is not Updated");
				}
				break;
				
			case 3:
				System.out.println("Enter Id which u want to delete: ");
				
				int id=sc.nextInt();
				
				StudentDao.deleteStudentData(id);
				System.out.println("Id is Deleted");
				break;
				
			case 4:
			StudentDao.showAllStudentData();
			break;
			default:
				System.out.println("Wrong Choice");
			}
		}
		while(ch!=5);

	}

}
