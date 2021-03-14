package com.kita.second.level3;

public class RCTest {
	public static void main(String[] args) {
		RCUser user = new RCUser();
		user.rc.turnOn();
		user.rc.setVolume(5);
		
		RCUser user2 = new RCUser(new Tv());
		user2.rc.turnOn();
		user2.rc.setVolume(5);
		
		user2.useRC(new Tv());
		
		//인터페이스 다형성 아래 필기필요
		RemoteControl rc1 = new Tv();
		RemoteControl rc2 = new Audio();

		rc1.turnOn();
		rc2.setVolume(5);
	}

}
