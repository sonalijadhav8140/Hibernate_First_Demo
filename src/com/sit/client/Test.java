package com.sit.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.model.Student;



public class Test {
  
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		         cfg.configure("hibernate.cfg.xml");
		         
		        SessionFactory sessionFactory = cfg.buildSessionFactory();	
		        
		        Session session = sessionFactory.openSession();
		        Transaction tx = session.beginTransaction();
		        Student stu=new Student();
		        stu.setId(101);
		        stu.setName("Sonali");
		        stu.setEmail("sonali@gmail.com");
		        stu.setAddr("Baramati");
		        
		        session.save(stu);
		        tx.commit();
	}
	
}
