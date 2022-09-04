package com.airlanguage.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		CarSecond carsecond = new CarSecond();
		// 위에것은 int a;와 같은 상태이다.
		
		
		//이제 여기에 int a = 1;과 같은 초기화를 해주려면..
		//클래스(CarSecond.java)에서 생성자를 만들어 줘야한다.
		CarSecond carsecond2 = new CarSecond("blue");
		CarSecond carsecond3 = new CarSecond("티볼리",3000);
		CarSecond carsecond4 = new CarSecond("모닝",5000,"black");
		
		
		System.out.println("Carsecond2 color : " + carsecond2.color);
		System.out.println("carsecond2 cc : "+ carsecond2.cc);
		
		System.out.println("------이름,cc-----------");
		
		System.out.println("carsecond3 color : "+carsecond3.name);
		System.out.println("carsecond3 cc : "+carsecond3.cc);
		
		System.out.println("------이름,cc,색상-----------");
		
		System.out.println("carsecond4 name : "+carsecond4.name);
		System.out.println("carsecond4 cc : "+carsecond4.cc);
		System.out.println("carsecond4 color : "+carsecond4.color);
		
	}

}
