package com.airlanguage.study.ch06;

public class board {

	
	String name = "김기율";
	int view = 0;
	boolean useNy = true;
	
	
	board(){
		
	}
	board(String name){
		this.name = name;
	}
	board(String name,int view){
		this.name = name;
		this.view = view;
	}
	board(String name, boolean useNy){
		this.name = name;
		this.useNy = useNy;
	}
	board(String name,int view, boolean useNy){
		this.name =name;
		this.view = view;
		this.useNy = useNy;
	}
	
	public void say() {
		System.out.println("이름 :" +name+",조회수"+view+",사용여부"+useNy);
	}
	
	
	
	
	
	
	
	
	
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
	

}
