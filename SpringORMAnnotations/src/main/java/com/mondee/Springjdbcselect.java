package com.mondee;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;


public class Springjdbcselect 
{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}
	
	public void selectEx() 
	{
		Session se=sessionFactory.openSession();
		Query qr=se.createQuery("from Student S");
		List li=qr.list();
		Iterator i=li.iterator();
		while(i.hasNext()) 
		{
			Student s=(Student)i.next();		
			System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSmarks());
		}
		
		}
	
	public void insert() 
	{
		
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=new Student();
		s1.setSid(50);
		s1.setSmarks(979);
		s1.setSname("praveen");
		se.save(s1);
		tx.commit();
	}

  public void update() 
  {
		
		Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=se.load(Student.class,40);
		s1.setSname("hari");
		se.update(s1);
		tx.commit();
	}
  
  public void delete()
  {
	  Session se=sessionFactory.openSession();
		Transaction tx=se.beginTransaction();
		Student s1=se.load(Student.class,101);
		se.delete(s1);
		tx.commit();
  }
  
  
  
}