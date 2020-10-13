package mypackage.controller;

import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import mypackage.model.Address;
import mypackage.model.Contact;
import mypackage.model.Employee;

public class Test {

	public static void main(String[] args) {
		
		  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		            
		    Employee e1=new Employee();    
		   
		    e1.setEname("Gaurav");    
		    e1.setEsalary(45);  
		    
		    
		    Address a1 = new Address();
		    a1.setCity("Indore");
		    a1.setState("MP");
		    a1.setPincode("452010");
		     
		    Contact c1 = new Contact();
		    c1.setCno("56904");
		    c1.setHno("57484");
		    
		    session.save(e1);  
		    session.save(a1);
		    session.save(c1);
		    
		    t.commit();  
		    System.out.println("successfully saved");    
		    factory.close();  
		      
        			
	
	}
}
