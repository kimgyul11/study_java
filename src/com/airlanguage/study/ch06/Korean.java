package com.airlanguage.study.ch06;

public class Korean {
//	---------------생성자 ------------
	String name ;
	String ssn ; 
	int age;
	
	Korean(String name,String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	 Korean(String name,int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	 Korean(){
		 
	 }
	 
	 static String nationlity = "대한민국";
	 static int straticTest (int a) {
		 return a+10;
	 }
	 
	 int ttest() {
		 Arithmetic arithmetic = new Arithmetic();

		 arithmetic.res(10);
		 return 1;
	 }
	 
	 public void ttest2() {
		 
		 Arithmetic.staticTest();
	 }
	 
	 
}
