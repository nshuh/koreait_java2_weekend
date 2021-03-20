package com.kita.second.level3.cafe;

public class BasicAPI {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		char c1 = str1.charAt(3); // 자바_프 -> 인덱스 번호가 0123에서 3 그러니 프가 찍힘
		System.out.println("c1: " + c1);
		
		//charAt으로 성별값 뽑아서
		//switch문으로 "남자입니다" 혹인 "여자입니다" 출력
		String addr = "123456-3456789";
		char c2 = addr.charAt(7);
		switch(c2) {
		case '1': case '3': // 위에 ""있기때문에 ''사용함
			System.out.println("남자입니다.");
			break;
		case '2': case '4':
			System.out.println("여자입니다.");
		}
		
		String str2 = "자바스크립트 프로그래밍";
		boolean result1 = str2.equals(str1);
		System.out.println("result1: " + result1);
		
		// String str1 = "자바 프로그래밍";
		int idx1 = str1.indexOf("그래밍"); //글자의 인덱스 넘버를 알려줌
		System.out.println("idx1: " + idx1);
		
		//indexof 사용해서 "안녕"이 들어가면 "있습니다"출력
		//안들어가면 "없습니다."출력
		String str3 = "안녕하세요 반갑습니다.";
		str3 = "만나서 반갑습니다.";
		int idx2 = str3.indexOf("안녕");
		
		if(idx2 < 2) { //틀림
			System.out.println("있습니다.");
		} else {
			System.out.println("없습니다.");
		}
		// if(idx2 != -1) -1은 없기때문에
//		if(idx2 == -1) { 
//			System.out.println("없습니다.");
//		} else {
//			System.out.println("있습니다.");
//		}
		
		int len = str3.length();
		System.out.println("str3의 길이는: " + len);
		
		String str4 = "오늘은 날씨가 좋다.";
		String result2 = str4.replace("날씨가", "기분이");
		System.out.println("result2: " + result2);
		System.out.println("str4: " + str4);
		
		String result3 = str4.substring(4);
		System.out.println("result3: " + result3);
		String result4 = str4.substring(4, 7);
		//인덱스 4번부터 찍고 7번부터 찍지 않겠다는 뜻임.
		//4:beginIndex, 7:endIndex
		System.out.println("result4: " + result4);
		
		String str5 = "Hello~ I'm fine thank you and you?";
		String result5 = str5.toLowerCase();//소문자
		String result6 = str5.toUpperCase();//대문자
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		
		String str6 = "      java programing      ";
		String result7 = str6.trim(); // 앞뒤 공백없애줌
		System.out.println("str6: " + str6);
		System.out.println("result7: " + result7);
		
		int num = 5;
		double num2 = 3.4;		
		String str7 = String.valueOf(num2); //문자열로 바꿀때...
		System.out.println("str7: " + str7);
		
		double r = Math.random(); // 0.0 <= r <1.0
//		int rNum = (int)(Math.random() * (max - min + 1) + min);
		
		double d1 = Math.ceil(5.6); //큰수로 올림 6.0으로 출력
		System.out.println("d1: " + d1);
		
		double d2 = Math.floor(5.6); //버림해서 5.0으로 출력
		System.out.println("d2: " + d2);
		
		double d3 = Math.round(5.6); //반올림
		System.out.println("d3: " + d3);
				
	}

}
