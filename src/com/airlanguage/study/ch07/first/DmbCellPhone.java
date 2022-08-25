package com.airlanguage.study.ch07.first;

public class DmbCellPhone extends Cellphone {

//자식
	
	
	
	//필드
	int channel;
	
	//생성자(명시적 생성자)
	DmbCellPhone(String model , String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//명시적 생성자를 만들면, 기본생성자 만들기	
	DmbCellPhone(){
		
	}
	
	//메소드 3가지 키는거 변경하는것 종료하는것
	void turnOnDmb(){
		System.out.println(channel+"번 채널을 켭니다.");
	}
	void turnOffDmb(){
		System.out.println("끕니다.DMB입니다..");
	}
	void changeChannel(int channel) {
		System.out.println(channel+"채널로 변경합니다."+model+"기종입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
//	//자식
//	
//	
//	
//		//필드
//		int channel;
//		
//		//생성자(명시적 생성자)
//		DmbCellPhone(String model, String color, int channel){
//			this.model=model;
//			this.color=color;
//			this.channel=channel;		
//		}
//		//명시적 생성자를 만들면, 기본생성자 만들기	
//		DmbCellPhone(){
//		}
//		
//		//메소드
//		void turnOnDmb() {
//			System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
//		}
//		void changeChannelDmb(int channel) {
//			this.channel = channel;
//			System.out.println("채널 "+ channel + "번으로 바꿉니다.");
//		}
//		void turnOffDmb() {
//			System.out.println("DMB방송 수신을 멈춥니다.");
//		}
	
}
