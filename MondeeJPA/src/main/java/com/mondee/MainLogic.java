package com.mondee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class MainLogic {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("naveen");
		EntityManager em = emf.createEntityManager();
		
		Student s = new Student();
		s.setSid(10);
		s.setName("naveen");
		s.setMarks(974);
		
		
	    System.out.println(s.getSid()+"  "+s.getName()+"  "+s.getMarks());
		
	}

}