package com.airlanguage.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		
		Week abc;
		
		Week xyz;
		
		abc = Week.MONDAY;
		
		System.out.println("Week.FRIDA: "+Week.FRIDAY);
		System.out.println("abc: "+abc);
		
		//String name = abc; //monday가 문자라 string으로 출력하려고하면 출력이 되지않음,형변환 해야함
		String name = abc.name();
		
		int ordinal = abc.ordinal();
		System.out.println("ordinal: " + ordinal);
		
		xyz = Week.THURSDAY;
		
		int result1 = abc.compareTo(xyz);
		int result2 = xyz.compareTo(abc);
		
		System.out.println("result : " + result1);
		System.out.println("result : " + result2);
		
		Week[] days = Week.values();
		
		int index = 0;
		for(Week day: days) {
			System.out.println(index + ": day : " + day);
			index ++;
		}
		
	}
}
