package com.jspider.hibernate.HibernateEx1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	
	public static void main(String[] args) {
		//transient state 
		//persistent state
		//detached state
		//removed state
		System.out.println("example");
		Configuration cfg = new Configuration();
		cfg.configure("hibernet.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		//creating student object
		student std = new student();
		std.setId(1);
		std.setName("reena");
		std.setEmail("reena@gmail.com");
		
	   //student:transient
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		//student:persistent:  associated with session ,database
//		std.setName("smith");
		//student:remove state
		s.delete(std);
//		std.getId();
//		s.save(std);
		tx.commit();
		
		
		s.close();
		//student :detached state
		std.setName("alien");
		System.out.println(std);
		f.close();
	}

}
