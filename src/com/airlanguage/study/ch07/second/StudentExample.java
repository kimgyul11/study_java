package com.airlanguage.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {
		
		
		//명시적 생성자를 사용하여 객체를 생성하고 모든필드를 출력하라.
		Student student = new Student("김기율","1234-1234",11);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		
	
		Student student2 = new Student("김기홀","1234-12311");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		
	}

}
