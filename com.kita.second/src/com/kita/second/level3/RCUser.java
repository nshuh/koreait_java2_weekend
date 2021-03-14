package com.kita.second.level3;

public class RCUser {
	RemoteControl rc = new Audio();
	
	RCUser () {}
	
	RCUser(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(0);
		rc.turnOff();
	}
	
	void useRC() {
		RemoteControl rc = new Audio();
	}
	
	void useRC(RemoteControl rc) {
		rc.turnOn();
	}

}
