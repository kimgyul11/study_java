package com.airlanguage.study.ch06;

public class CarSecond {
	
	String name = "아반떼";
	String color = "red";
	int cc = 1500;
	
//	명시적생성자.. 아래 보이는것들이 존재한다면 기본생성자를 만들어줘야한다.
	CarSecond(String color){
		this.color = color;
	}
	
//	자동차 이름과 cc
	CarSecond(String name,int cc){
		this.name = name;
		this.cc = cc;
	}
	
//	자동차 이름, CC ,색깔	
	CarSecond(String name, int cc, String color){
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
//보통 사용할때는 아래처럼 만든다..
//	CarSecond(String name){
//		name=name이렇게 만들면 헷갈리니
//		this.name = name 이렇게쓴다.
//	}
// 	
	
	
	//오버로드 : 함수의 이름이 같은데 매개변수가 다른것이다.
	
// *******명시적생성자가 만들어지면 기본생성자를 만들자.	
	CarSecond(){
		
	}
}
