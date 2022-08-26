package com.airlanguage.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
	
		
		
		//부모 객체를 생성하고 powerOn 메서드 실행.
		Cellphone cellphone = new Cellphone();
		cellphone.turnOn();
		cellphone.turnoff();
	
		//자식 객체 생성 *자식객체를 만들면 자동으로 부모객체도 생성된다. 참고하자
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		
		//자식 객체의 turnoffDmb
		dmbcellphone.turnOffDmb();
		
		//Dmbcellphone에서 만든 생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbcellphone2 = new DmbCellPhone("아이폰15","레드",3);
		
		
		
		// dmbcellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		dmbcellphone2.turnOffDmb();
		dmbcellphone2.turnOnDmb();
		dmbcellphone2.changeChannel(14);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//부모 객체를 생성하고 powerOn 메서드 실행.
//		Cellphone cellphone = new Cellphone();
//		
//		cellphone.powerOn();
//		
//		//자식 객체 생성
//		//자식 객체 만들면 부모객체 자동으로 생성된다.
//		DmbCellPhone dmbcellphone = new DmbCellPhone();
//		
//		//자식 객체의 turnoffDmb
//		dmbcellphone.turnOffDmb();
//		
//		//생성자를 이용하여 자식 객체 생성
//		DmbCellPhone dmbcellphone2 = new DmbCellPhone("Iphone10","black",6);
//		
//		// dmbcellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
//		dmbcellphone2.turnOnDmb();
//		dmbcellphone2.changeChannelDmb(89);
//		dmbcellphone2.turnOffDmb();
//		
//		dmbcellphone2.powerOn();
//		dmbcellphone2.powerOff();
//		dmbcellphone2.bell();
//		dmbcellphone2.receiveVoice("안녕하세요ㅓ");
//		dmbcellphone2.sendVoice("안녕하세요");
//		dmbcellphone2.hangup();
	}

	
}
