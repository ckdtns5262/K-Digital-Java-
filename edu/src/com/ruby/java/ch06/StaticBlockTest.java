package com.ruby.java.ch06;

public class StaticBlockTest {
	
	static {
		System.out.println("hello");  // 정적코드 블록은 main() 실행되기 전에 딱 한번 실행됨
		System.out.println("java");	  // static 선언한 클래스 필드를 초기화하거나 프로그램이 실해오딜 때 먼저 처리해야 하는 작업일때 정적코드 블록 사용
	}
	public static void main(String[] args) {
		System.out.println("world !!");

	}

}
