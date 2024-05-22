package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="dept_details")
public class Department {

	@Id	
	private int deptid;
	@Column (name="deptname")
	private String name;
	@OneToOne
	private Employee employee;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String name, Employee employee) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.employee = employee;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + ", employee=" + employee + "]";
	}
	
	
}
