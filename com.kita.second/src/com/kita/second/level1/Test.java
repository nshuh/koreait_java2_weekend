package com.kita.second.level1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClassEx cl = new ClassEx();
		int result = cl.sum(3,2,5,4,2,2,4,4,1);
		//int[] arr = {3,2,5,4,2,2,4,4,1};
		System.out.println("result: " + result);
		int result2 = cl.sum(4,5,1,3,5,12,5,9);
		System.out.println("result2: " + result2);
		
//		final int LEN = 3; //상수 : 변하지 않는 수
//		LEN = 4;
		
	}

}
