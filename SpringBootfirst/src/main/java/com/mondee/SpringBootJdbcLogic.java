package com.mondee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJdbcLogic {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ca=SpringApplication.run(SpringBootJdbcLogic.class, args);
		
EmployeeDao ed=ca.getBean(EmployeeDao.class, args);
 Employee ee=new Employee();
 ee.setEid(2205);
ee.setEname("Naveen");
ee.setEsalary(22000);
ed.insert(ee);
	}	
}