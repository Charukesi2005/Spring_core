package com.tnif.springcoreexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 public class App{
	  public static void main(String[]args) {
		  
		  //it is IOC container
		  //It reads and manages the Bean
		  ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		  
		  College college= (College) context.getBean("CollegeBean");
	  college.show();
	  }
	
  }