package com.airlanguage.study.ch06;

public class HyundaiExample {

	public static void main(String[] args) {

		Hyundai hyundai = new Hyundai();
				for (int i = 0; i < hyundai.name.length; i++) {
					System.out.println("자동차 : " + hyundai.name[i]);
				}
				
	}
}
