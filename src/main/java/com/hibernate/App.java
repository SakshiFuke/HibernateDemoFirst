package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	//session factory created
    	SessionFactory sessionfactory=cfg.buildSessionFactory();
    	
    	//open the session
    	Session session=sessionfactory.openSession();
    	
    	//begin transction
    	Transaction tr =session.beginTransaction();    	
    
    	//map object to database 
    	Employee emp1=new Employee();
    	Department dept=new Department();
    	
    	emp1.setId(2);
    	emp1.setName("amru");
    	emp1.setDept("IT");
    	emp1.setSalary(200000);
    	emp1.setDeprtment(dept);
    
    	
    	dept.setDeptid(1);
    	dept.setName("IT");
    	dept.setEmployee(emp1);
    	
    	session.save(emp1);
    	session.save(dept);
    	
    	tr.commit();
    
    	session.close();
    	
    	System.out.println("employee and deparment add hua...");
    }
}
