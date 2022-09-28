package com.ruby.java.ch07.inheritance;

public class LMSTest2 {
	public static void main(String[] args) {
		Employee27 e = new Employee27("홍길동", 47, "입학처");
		Professor27 p = new Professor27("홍이동",52, "빅데이터");
		Student27 s = new Student27("홍삼동",20, "컴퓨터과학");
	
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}