package com.ruby.java.ch06;
class Student {
	 private int sno;
	 private String sname;
	 private double weight;
	

	 public void getStudent(int a, String b, double c) {
//		 this.sno = sno;
//		 this.sname = name;    변수 이름이 같을 때 this 사용
//		 this.weight =weight;
		 sno = a;
		 sname = b;
		 weight =c;
		
	}
	 public void showStudent() {
		
		 System.out.println("학번:"+ sno); 
		 System.out.println("이름:"+ sname);
		 System.out.println("몸무게:"+ weight);
		 
		 
		 
}
	}


public class ProcessStudent {
	public static void main(String[] args) {
		Student a = new Student();
		a.getStudent(12, "chang",55.1) ;
		a.showStudent();
		Person p = new Person();
		p.getName();
		p.getAge();
	}
	
}

	


