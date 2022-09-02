package com.airlanguage.study.test;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 7;
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름 : "+ r);
		System.out.println("원면적 : "+ calculator.param(r));
		System.out.println("원면적 : "+ computer.param(r));
	}

}
