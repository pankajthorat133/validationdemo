package com.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Test {
	
	public static void main(String[] args) {
		
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession(); 
	Transaction t = session.beginTransaction();   
    
	
	Employee e1= new Employee();
	e1.setName("Vijay");
	Address add=new Address();
	
	add.setCity("nashik");
	add.setState("MH");
	add.setCountry("India");
	e1.setAddress(add);
	//add.setEmployee(e1);
	
	session.persist(e1);
	
	t.commit();
	session.close();
	System.out.println("Success Full Inserted");
	}
	
	

}
