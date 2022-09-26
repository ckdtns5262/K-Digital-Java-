package com.ruby.java.ch06;

public class StaticMethodTest {
	int num =123;
	public static void main(String[] args) {
		
		StaticMethodTest.print1();   //static 객체가 없어도 실행 가능
		print1();
		StaticMethodTest exam = new StaticMethodTest();
		Count c = new Count();
		exam.print2();	
	}
	
	public static void print1() {
		//int num2 =num;		//오류 : static은 객체가 없어도 돌아가야하는데 num이라는 필드에 123 이 들어가기 때문에 오류가 남 (static은 class에 있는데이터사용X)
		System.out.println("hello");
	}
	public void print2() {
		int num; 
		System.out.println("java");
	}

}
