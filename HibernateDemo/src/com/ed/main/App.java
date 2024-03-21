package com.ed.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ed.entity.Employee;

public class App {

	public static void main(String[] args) 
	{
      Employee e1=new Employee();
		
		e1.setEmpName("sam");
		e1.setAge(21);
		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = HibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
 //create the session object
		session.beginTransaction();
		//create the transaction from the session object

		session.save(e1); 
		
		
		session.getTransaction().commit(); 
		session.close();
		}

}
