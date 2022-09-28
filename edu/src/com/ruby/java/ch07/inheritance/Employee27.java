package com.ruby.java.ch07.inheritance;

public class Employee27 extends Person27 {
	private String dept;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString() {
		return super.toString() + dept;
	}
	public Employee27(String name, int age, String dept) {
		super(name, age);
		 // super는 person 상속
		// super는 person 상속
		this.dept =dept;   // this는 Employee27 상속
		System.out.println("Emplyee27(name,age,dept) 생성자 실행");
	}

}
	