package com.airlanguage.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		Car car = new Car();
		Handbag handbag = new Handbag();
		Language language = new Language();
		
		System.out.println("아이폰 모델명 : " + iphone.name);
		System.out.println("Car name : " + car.name);
		System.out.println("Car name2[1] : " + car.name2[1]);
		System.out.println("language name : " + language.name);
		
		// . 연산자 : 필드와메소드의 차이는 괄호가 있냐 없냐.괄호가 있으면 함수 없으면 변수
		iphone.pr();// 클래스에 이미 출력하는 함수로 정의 했기 때문에 print하지 않아도 된다.
		System.out.println("handbag name : "+ handbag.name);
		
		//다른 클래스의 있는 변수 이름 바꾸기
		// 원래는 이렇게 변수를 변경하는데 name = "소나타";
		//아래와같이 바꿔줌
		car.name = "소나타";
		System.out.println("car.name : "+car.name);
		
		language.name="일본어";
		System.out.println(language.name);
		//변경못하게 하는거 private String name = "차이름" ; 이렇게 클래스에 선언해놓으면됨..
		
		language.pratice();
		
	}
}
