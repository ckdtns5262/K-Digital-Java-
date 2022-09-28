package com.ruby.java.ch07.inheritance;

public class Person27 {
	
	private String name;
	private int age;
	
	public Person27() {
		System.out.println("Person 생성자 실행");
	}
	public Person27(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person27 생성자 실행");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return name + ":" + age + ":";
	}
	
}
