package com.tnif.springcoreexample;

public class College {
 
	private Student student;
 public College() {
	 System.out.println("College Object Created");
 }
 public void show() {
	 System.out.println("Welcome To College");
	 student.display();
 }
}
