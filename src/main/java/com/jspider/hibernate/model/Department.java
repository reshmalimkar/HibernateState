package com.jspider.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	private int departId;
	private String dpName;

	public int getDepartId() {
		return departId;
	}

	public void setDepartId(int departId) {
		this.departId = departId;
	}

	public String getDpName() {
		return dpName;
	}

	public void setDpName(String dpName) {
		this.dpName = dpName;
	}

	@Override
	public String toString() {
		return "Department [departId=" + departId + ", dpName=" + dpName + "]";
	}
	
}
