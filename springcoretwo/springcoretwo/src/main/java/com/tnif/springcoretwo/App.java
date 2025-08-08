package com.tnif.springcoretwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
      //loads the config file
	  ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
  
	  //getBean
	  College college=context.getBean("college",College.class);
	  
	  college.showCollegeDetails();
  }
  
}
