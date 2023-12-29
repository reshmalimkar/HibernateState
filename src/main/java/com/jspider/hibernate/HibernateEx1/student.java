package com.jspider.hibernate.HibernateEx1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studtbl")
//@Table(appliesTo = "")
public class student {
	@Id
	private int id;
	private String name;
	private String email;
	public student() {
	
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
