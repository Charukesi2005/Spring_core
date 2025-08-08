package com.tnif.springcoreexample;

public class Student {
	
private String name;

public void setName(String name) {
	this.name=name;
}


public Student() {
	System.out.println("Student Object Created");
} 

public void display() {
	System.out.println("Student Name:"+name);
}

}
