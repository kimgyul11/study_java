package com.airlanguage.study.ch07.second;

public class Student extends People{

	public int studentNo;
	
//	super-부모
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name,ssn);
	}
	
	public Student() {		
	}
}
