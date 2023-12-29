package com.jspider.HibernateEx1.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernet.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		System.out.println(factory);
		//create the question
		Question q1 = new Question();
		q1.setQuestionId(101);
		q1.setQuestion("what is java");
		//create the answer
		Answer answer = new Answer();
		answer.setAnswerId(1);
		answer.setAnswer("java is programming language");
		q1.setAnswer(answer);
//		Question q2 = new Question();
//		q2.setQuestionId(101);
//		q2.setQuestion("what is java");
//		//create the answer
//				Answer answer1 = new Answer();
//				answer1.setAnswerId(1);
//				answer1.setAnswer("java is programming language");
//				q2.setAnswer(answer1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
//		session.persist(args);
		session.persist(q1);
//		session.persist(q2);
		tx.commit();
		
		session.close();

		factory.close();
		
	
	}

}
