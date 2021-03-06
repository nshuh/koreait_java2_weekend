package com.kita.second.level1.practice;

public class Tv {
	
	//전원(isPowerOn) 채널(channel) 볼륨(volume)
	//기본값 전원 false, 채녈 1, 볼륨 0
	//전원켜기(powerOn), 전원끄기(powerOff)
	//채널올리기(channelUp), 채널내리기(channelDown)
	//볼륨올리기(volumeUp), 채널내리기(volumeDown)
	
	//필드
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	//생성자 (매개변수로 받을시 this사용)
	public Tv() {
		isPowerOn = false;
		channel = 1;
		volume = 0;
	}
	
	//메소드
	void powerOn() {
		if(isPowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;
		}
		isPowerOn = true;
		System.out.println("전원켜기");
	}
	void powerOff(){
		if(!isPowerOn) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		isPowerOn = false;
		System.out.println("전원끄기");
	}
	void channelUp() {
		channel++;
		System.out.println("채널올리기");
	}
	void channelDown() {
		if(channel<2) {
			System.out.println("최소 채널입니다.");
			return;
		}
		channel--;
		System.out.println("채널내리기");
	}
	void volumeUp() {
		System.out.println("볼륨올리기");
	}
	void volumeDown() {
		System.out.println("볼륨내리기");
	}

}
