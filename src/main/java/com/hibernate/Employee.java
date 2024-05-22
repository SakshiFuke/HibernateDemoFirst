package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="emp_details")
public class Employee {
	@Id	
	private int id;
	@Column (name="empname")
	private String name;
	@Column (name="empdept")
	private String dept;
	@Column (name="empsal")
	private int salary;
	@OneToOne
	private Department deprtment;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String dept, int salary, Department deprtment) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.deprtment = deprtment;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDeprtment() {
		return deprtment;
	}
	public void setDeprtment(Department deprtment) {
		this.deprtment = deprtment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", deprtment="
				+ deprtment + "]";
	}
	
	
	
	
}



/*
 * POJO- Plain old java object
 * Bean- spring
 * Entity 
 * 
 * JPA- Java persistance -specification
 * 
 * hibernate - implementation
 * 
 * interface A			//specification
 * {
 * 	show();
 * }
 * class nm implements A 	//nm is implementation
 * {
 * 	show()
 *  {
 *  
 *  }
 * }
*/