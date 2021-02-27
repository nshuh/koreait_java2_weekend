package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		기본형변수
//		char : 빈칸, 숫자시 0
//		숫자 : 0
//		boolean : false
//		참조형 변수: null
				
		Phone myPhone = new Phone();
		myPhone.call("엄마");
		myPhone.color = "파랑";
		myPhone.phoneName = "이이폰12";
		myPhone.owner = "HNS";
		myPhone.memory = 512;
		
		Phone yourPhone = new Phone();
		
		
		
		
	}

}
