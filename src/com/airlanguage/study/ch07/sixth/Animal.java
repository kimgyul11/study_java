package com.airlanguage.study.ch07.sixth;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
	public abstract void sound(String m);
	//abstract의 의미는 반드시 상속받는애들이 이 추상메소드를 만들어야한다는 뜻...
}
