package com.kita.second.level1.baseball;

public class Baseball {
	// 컴퓨터가 랜덤으로 숫자 뽑는 클래스
	// 필드
	private int[] rArr;
	
	// 생성자
	public Baseball(int gameCnt) {
		rArr = new int[gameCnt];
		setRandoms();
	}
	
	// 메소드
	// 랜덤값을 배열 안에 set해주기 setRandoms()
	private void setRandoms() { // 외부의 영향을 받지 않도록 private 걸어줌
		int max = 9;
		int min = 1;
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max - min + 1) + min); //랜덤숫자 생성
			for(int z=0; z<i; z++) {  //중복안되게
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
	}
	// 배열 안의 랜덤값 하나 뽑기 getRNum()
	
	int getRNum(int idx){
		return rArr[idx];
	}
	
}
