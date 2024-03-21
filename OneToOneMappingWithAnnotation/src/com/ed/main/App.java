package com.ed.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ed.entity.Applicant;
import com.ed.entity.Passport;

public class App {

	public static void main(String[] args) 
	{

				System.out.println("Mapping One to One relationship");
				
				Session session=HibernateUtil.getSessionFactory().openSession();
				Transaction t = session.beginTransaction();
				
				Passport p=new Passport();
				Applicant a=new Applicant();
				
				
				a.setName("shreyash");
				a.setCity("Thane");
				a.setAge(24);
				a.setPassport(p);
				p.setPassportNumber("America123");
				p.setIssuedDate(new Date());
				p.setExpiryDate(new Date());
				p.setApplicant(a);
				session.save(a);
				t.commit();
				session.close();
				System.out.println("Data stored successfully");				
			}
}
