package com.ruby.java.ch07.inheritance;

public class Professor27 extends Person27 {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString () {
		return super.toString()
				+ subject;
	}
	public Professor27(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
		System.out.println("Professor(name,age,subject) 생성자 실행");
	}
}
