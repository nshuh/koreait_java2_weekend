package com.kita.second.level3;

public class MusicPlay implements IUAlbum, BTSAlbum { //인터페이스는 다중상속이 가능함
	public void playIUAlbum() {
		System.out.println("아이유 앨범을 재생한다.");
	}
	
	public void playBTSAlbum() {
		System.out.println("BTS 앨범을 재생한다.");
	}

}
