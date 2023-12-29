package com.jspider.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentAndDepartMentOTOMapping {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernet.cfg.xml");
		SessionFactory f = cfg.buildSessionFactory();
		Session session = f.openSession();
		System.out.println("Open Session");
		saveStudent(session);
		//getData(session);
		f.close();

	}

	public static void getData(Session session) {
		Student student =(Student) session.get(Student.class, 1);
		System.out.println(student);
	}

	public static void saveStudent(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();
		Student student = getStudent();
		Department department = getDepartment();
		student.setDepartment(department);
		session.save(student);
		System.out.println("Record Added Successfully....");
		transaction.commit();
		session.close();
	}

	public static Student getStudent() {
		Student student = new Student();
		student.setStudId(1);
		student.setFname("Vitthal");
		student.setLname("Jadhav");
		return student;

	}

	public  static Department getDepartment() {
		Department department = new Department();
		department.setDepartId(11);
		department.setDpName("IT");
		return department;
	}
}
