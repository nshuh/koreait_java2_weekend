package com.kita.second.level3.cafe;

public class AnonymousObject { // 익명객체
		public static void main(String[] args) {
			ParentAO p = new ChildAO();
			ChildAO c = (ChildAO)p; // 강제형변환을 사용해야 에러가 나지 않음
			c.parentMethod();
			p.parentMethod();
			
			ParentAO p2 = new ParentAO() {
				int childField;
				
				@Override
				void parentMethod() {}
				
				void childMethod() {}
			}; // 익명객체에 ;사용함
		}

}

class ParentAO {
	int parentField;
	
	void parentMethod() {
		
	}
}

class ChildAO extends ParentAO {
	int childField;
	
	
	@Override
	void parentMethod() {}
	
	void childMethod() {}
}
