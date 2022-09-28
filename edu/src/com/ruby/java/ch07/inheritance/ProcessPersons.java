package com.ruby.java.ch07.inheritance;

class Person {
	private String pno;
	private	String pname;
	private	int age;
	
	public Person() {
		System.out.println("default 생성자");
		pno =null; pname =null; age =0;
	}
	public Person(String pn) {
		this();
		pno = pn; 
	}
	public Person(String pn, String name) {
		this(pn);
		pname = name; 
	}
	public Person(String pn, String name, int a) {
		this(pn,name);
		age = a;
	}
	public void show() {
		System.out.println("pno =" + pno + " pname ="+ pname + " age ="+ age);
	}
	public String toString() {
		return super.toString() + "age =" + age;
	}
}
class Student extends Person {
	private	String schoolName;
	private	int schoolYear;
	
	public Student(String pn, String name, int a, String sn, int sy) {
		super(pn,name,a);
		schoolName = sn;  schoolYear =sy;
	}
	public void show() {
		super.show();
		System.out.println("schoolName =" + schoolName + " schoolYear ="+ schoolYear);
	}
	public String toString() {
		return super.toString() + "schoolName =" + schoolName + "schoolYear =" +schoolYear;
	}
	public void show(int a) {
		super.show();
		System.out.println(toString());
	}
}
class WorkStudent extends Student{
	private String job;
	private int salary;
	
//	public WorkStudent(){job = null; salary=0;}
	public WorkStudent(String pn, String name, int a, String sname, int syear, String j, int pay) {
		super(pn, name, a, sname, syear);
		job =j; salary = pay;
	}
//	public void show() {
//		super.show();
//		System.out.println("job =" + job + " salary =" + salary);
//	}
	public String toString() {
		return super.toString()+"job = " +job +"salary =" + salary;	
	}
	public void show() {
		super.show();
		System.out.println(toString());
	}
}
public class ProcessPersons {
	static void display(Person[] p) {
		for(int i= 0; i< 6; i++)
			p[i].show();
	}
	public static void main(String[] args) {
//	WorkStudent ws = new WorkStudent();
	Person list[] = new Person[10];
	Person p = new Person();
	Person p1 = new Person("p005");
	Person p2 = new Person("p006","Lee");
	Person p3 = new Person("p007","Park",30);
	Student s1 = new Student("p004","Kim", 30,"동아대",9);
	WorkStudent ws = new WorkStudent("p005", "Lee", 30, "부산대", 2, "code", 2000);
	list[0] = p; list[1] = p1; list[2] = p2; list[3] = p3; list[4] = s1; list[5] = ws;
	display(list);
//	show(); // show는 ProcessPerson 내에 있는 class 가 아니기 때문에 호출 불가
//	p3.show();	
//	s1.show();
	ws.show();
	
	}

}
