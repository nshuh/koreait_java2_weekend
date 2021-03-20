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
		for(int i=0; i<myArr.length; i++) { // myArr의 길이만큼  scanner 사용해서 값 입력받기
			System.out.printf("값%d: \n", i+1);
			String val = scan.next();
			try {
				myArr[i] = Integer.parseInt(val);
			} catch(Exception e) {
				i--;
				System.out.println("1~9까지의 숫자값을 입력하시오.");
				continue;
			}
			
			for(int z=0; z<i; z++) {
				if(myArr[z] == myArr[i]) {
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
