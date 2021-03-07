package com.kita.second.level2.bts;

import com.kita.second.level2.sogilli.*; //sogilli 패키지 안에 있는 모든것을 import 함
//import com.kita.second.level2.sogilli.Hyori;
//import com.kita.second.level2.sogilli.Sangsun;

public class Sugar {
	void method() {
		Hyori hr = new Hyori("유고걸");
		String music = hr.music;
//		int follower = hr.follower ;
//		boolean star = hr.star;
		Sangsun ss = new Sangsun();
		
		hr.sing();
//		hr.drinkTea();
//		hr.yoga();
		
//		Hyori hr2 = new Hyori(100);
//		Hyori hr3 = new Hyori(true);
	}
	
	


}
