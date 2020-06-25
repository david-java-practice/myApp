package com.exam01;

public class Student {
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String dept, String  id, 
			double grade) {
		this.name = name;
		this.department = dept;
		this.id =id;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getId() {
		return id;
	}

	public double getGrade() {
		return grade;
	}

}




