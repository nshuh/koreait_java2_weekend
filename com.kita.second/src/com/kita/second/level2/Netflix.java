package com.kita.second.level2;

public class Netflix {
	//필드
	int chapter = 0;
	int maxChapter; //작품의 최대편수

	//생성자
	public Netflix(int maxChapter){
		this.maxChapter = maxChapter; //maxChapter는 2임 
	}

	//메소드
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("넷플릭스를 시청한다.");
			return true;
		}
		System.out.println("넷플릭스를 이미 다 시청했다.");
		return false;
	}
	
}
