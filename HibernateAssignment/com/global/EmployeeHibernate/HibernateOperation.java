package com.global.EmployeeHibernate;

import java.util.Scanner;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class HibernateOperation {
	Scanner scanner=new Scanner(System.in);
	Configuration conf=new Configuration().configure().addAnnotatedClass(Employee.class);
	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
	SessionFactory factory=conf.buildSessionFactory(reg);
	Session session=factory.openSession();
	private static final Logger LOGGER = Logger.getLogger(HibernateOperation.class.getName());;
	
	Transaction transaction=session.beginTransaction();
	
	void displayMenu()

	{
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Find");
		System.out.println("4.update");
	}
	
	void insert()
	{
		Employee employee=new Employee();
		System.out.println("Enter Employee code");
		employee.setEcode(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Enter Employee name");
		employee.setName(scanner.nextLine());
		System.out.println("Enter Employee Domain");
		employee.setDomain(scanner.nextLine());
		session.save(employee);
		 transaction.commit();
		 LOGGER.info("Record inserted");
		
		
	}
	
	void delete()
	{
		System.out.println("Enter Employee code to be deleted");
		 int ecode=scanner.nextInt();
			Employee employee=(Employee)session.get(Employee.class,ecode);
			session.delete(employee);
			 transaction.commit();
			 LOGGER.info("Record deleted");
		
	}
	
	void find()
	{
		System.out.println("Enter Employee code for search");
		 int ecode=scanner.nextInt();
		 Employee employee=(Employee)session.get(Employee.class,ecode);
		 LOGGER.info("Searched Record is:");
		 System.out.println(employee);
		
	}
	
	void update()
	{
		System.out.println("Enter Employee code to be updated");
		 int ecode=scanner.nextInt();
		 Employee employee=(Employee)session.get(Employee.class,ecode);
		 scanner.nextLine();
			System.out.println("Enter Employee name");
			employee.setName(scanner.nextLine());
			System.out.println("Enter Employee Domain");
			employee.setDomain(scanner.nextLine());
			session.update(employee);
			 transaction.commit();
			 LOGGER.info("Record updated");
		
	}
}

