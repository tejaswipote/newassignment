package com.global.EmployeeHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee_table")
public class Employee {
	@Id
	@Column(name="employee_Code")
	private int ecode;
	private String name;
	private String domain;
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	@Override
	public String toString() {
		return "Employee [ecode=" + ecode + ", name=" + name + ", domain=" + domain + "]";
	}
	
	

}
