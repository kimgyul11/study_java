package com.airlanguage.study.ch07.forth;

public class SupersonicAirplane extends Airplane{
	
	//상수는 대문자로 복합은 언더바로 구분
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();
		}
	}
	
	
}
