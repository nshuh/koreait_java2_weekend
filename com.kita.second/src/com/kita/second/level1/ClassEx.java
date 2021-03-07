package com.kita.second.level1;

public class ClassEx extends Object{
//클래스의 구성은 아래와 같음	
	//필드:만들고자 하는 부품의 상태, 속성
	int field1;
	String field2;
	int[] field3;
	
	
	int field4;
	static int field5;
	
	void method4() {}
	static void method5() {}
	
	static void methodTest() {
//		this.field4 = 10;
//		method4();
		
		field5 = 10;
		method5();
	}
	
	
	
	
	//생성자:필드를 초기화 시킴, 메소드를 집어넣어 동작하게 함. 해당클래스의 이름과 같아야 함
	public ClassEx(){
//		super();
		
	}
	public ClassEx(int field1){
		this.field1 = field1+1;
	}
	
	public ClassEx(int field1, String field2) {
		this(field1); //ClassEX(field1);
		this.field2 = field2;
	}
	
	public ClassEx(int field1, String field2, int[] field3) {
		this(field1, field2);
		this.field3 = field3;
	}
	
	//메소드:동작, 행동
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public int sum(int n1, int n2, int n3) {
		int result = sum(sum(n1,n2),n3);		
//   	int result = sum(n1, n2) + n3;
//		int result = n1 + n2 + n3;
		return result;
		
    //public int(보내줄 타입) sum(동사형, 어떤일을 할 건지 동작)
	}
	
	int sum(int...arr) {
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
		}
		
		return total;
	}
	

	
	//매개변수의 1.타입 2.개수 3.위치
	
}


