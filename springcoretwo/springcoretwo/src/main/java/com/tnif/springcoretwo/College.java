package com.tnif.springcoretwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

	private Student student;
//Constructor injection
	@Autowired
	public College(Student student) {
		super();
		this.student = student;
	}
	
	
	public void showCollegeDetails()
	{
		System.out.println("Welcome To College");
		student.showStudent();
	}
}
