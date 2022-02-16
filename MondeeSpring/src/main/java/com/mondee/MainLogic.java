package com.mondee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLogic {
	
	public static void main(String args[]) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		
		Travel travel = (Travel) ac.getBean("Banglore");
		travel.startJourney();
		//Travel travel2 = (Travel) ac.getBean("Hyderabad");
		//travel2.startJourney();
		//System.out.println(st.getSid()+" "+st.getSname()+" "+st.getSmarks());
	}
}