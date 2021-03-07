package com.kita.second.level2.sogilli;

public class Hyori {
	//public : 어디에서 든지 접근에 제한없음
	//protected : 
	//default : 아무것도 없이... 본인 패키지 내부에서만 접근 (외부에서 접근불가)
	//private : 자신의 클래스 내부에서만 접근가능함 (외부에서 접근불가)
	
	
	//필드
	public String music;
	int follower; //default
	private boolean star = true;
	
	//생성자
	public Hyori(String music) {
		this.music = music;
		follower = 100;
		star = true;
	}
		
	Hyori(int follower) {
		sing();
		drinkTea();
		yoga();
	}
	
	private Hyori(boolean star) {}


	//매소드
	public void sing() {}
	void drinkTea() {}
	private void yoga() {}

}
