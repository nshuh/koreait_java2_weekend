package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	// 컴퓨터가 랜덤으로 숫자 뽑는 클래스
	// 필드
	private int[] myArr;
	private Scanner scan;
	
	public MyBall (int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	//메소드
	//숫자를 입력받기 setNumbers()
	void setNumbers() {
		int max = 9;
		int min = 1;
		for(int i=0; i<myArr.length; i++) { // myArr의 길이만큼  scanner 사용해서 값 입력받기
			System.out.printf("값%d: \n", i+1);
			myArr[i] = scan.nextInt(); 
			if(myArr[i] < min || myArr[i] > max) {
				System.out.println("범위 밖의 숫자임.");
				i--;
				continue;
			}
			for(int z=0; z<i; z++) {
				if(myArr[i] == myArr[z]) {
					System.out.println("중복된 숫자임.");
					i--;
					break;
				}
			}
		}
	}
	
	//내 배열안의 숫자값 뽑기 getMyNum()
	int getRNum(int idx){
		return myArr[idx];
	}

}
