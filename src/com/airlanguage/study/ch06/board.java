package com.airlanguage.study.ch06;

public class board {

	
//	String name = "김초기";
//	int view = 0;
//	boolean useNy = true;
//
//	Board2(){
//	}
//	Board2(String name){
//		this.name = name;
//	}
//	Board2(String name, int view){
//		this.name = name;
//		this.view = view;
//	}
//	Board2(String name, boolean useNy){
//		this.name = name;
//		this.useNy = useNy;
//	}
//	Board2(String name, int view, boolean useNy){
//		this.name = name;
//		this.view = view;
//		this.useNy = useNy;
//	}
//	public void say() {
//		System.out.println("이름: "+name+", 조회수: "+view+", 사용여부: "+useNy);
//	}
	
	
	String name = "김기율";
	boolean ny = false;
	String view = "0";
	
	board(String name){
		this.name=name;
	}
	board(String name,String view){
		this.name=name;
		this.view=view;
	}
	board(String name,boolean ny){
		this.name=name;
		this.ny=ny;
	}
	board(String name,String view,boolean ny){
		this.name=name;
		this.view=view;
		this.ny=ny;
	}
	
	board(){
			
	}
	
	

}
