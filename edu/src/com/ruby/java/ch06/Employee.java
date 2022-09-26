package com.ruby.java.ch06;
class Person {	
	private String name;
	private int age;
	private String dept;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Employee {
	private String name;
	private int age;
	private String dept;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		age ++;
		return age;	
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	public static void main(String[] args) {
		Person p = new Person();
		//p.age =13;
		int num = 0;
		Employee e = new Employee();
		e.age = 30;
		 // age = 24;
		num = 15;
		System.out.println(e.age);
		e.setAge(10);
		Employee s = new Employee();
		Student1 s2 = new Student1();
		

		p.getName();
		
		s2.setAge(33);
		s2.getAge();
		System.out.println("나이 = " + s2.getAge());
		s.setName("Hello");
		System.out.println("age = " + e.getAge());
	

	}

}
