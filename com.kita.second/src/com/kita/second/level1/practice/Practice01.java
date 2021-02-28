package com.kita.second.level1.practice;

public class Practice01 {
	// 구구단 2단 찍기 메소드를 만들어 보자
	// 2 * 1 = 2
	// 2 * 2 = 4
	// ...
	// 2 * 9 = 18
	public static void main(String[] args) {
		printGugudan();
		System.out.println();
		printGugudan2(9);
		printStars(6,3);
		
		int result = sum(1, 2);
		int result2 = sum(result, 3);
	}
	
	public static void printGugudan() {
		for(int i=1; i<10; i++) {
			System.out.printf("2 * %d = %2d\n",i,2*i);
		}
	}
	
	//오버로딩(Overloading) -- 한 클래스에서 같은 이름의 메소드를 여러개 만드는 것 
	//매개변수의  1.개수 , 2.타입, 3.위치(순서)
	public static void printGugudan2(int dan) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %2d\n",dan,i,dan*i);
		}
	}
	
	// 별찍기 메소드
	// 내가 입력하는 값에 따라 line(줄)과  star(별개수)가 달라지도록
	// line:3, star:5
	// *****
	// *****
	// *****
	
	public static void printStars(int line, int star) {	
		for(int i=0; i<line; i++) {
			for(int z=0; z<star; z++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	public static int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	
}
