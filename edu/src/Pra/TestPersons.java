package Pra;

abstract class Person {

	String pnum;
	String name;
	int age;

	public Person(String pnum, String name, int age) {
		super();
		this.pnum = pnum;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return pnum + ":" + "이름 : " + "name" + "나이 : " + age;
	}

	abstract void show();

	abstract void increase();

}

class Employee extends Person {
	private String job;
	private String dept;
	private int salary;

	public void show() {
		System.out.println(super.toString() + ":" + job + ":" + dept + ":" + salary);
	}

	public void increase() {
		this.salary += 0.1 * salary;
	}

	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}
	
}
	
class Designer extends Employee {
	private String language;
	private int workYear;
	private int salary;

	
	public void show() {
		System.out.println(super.toString() + ":" + language + ":" + workYear);
	}
	public void increase() {
		this.salary += salary * 0.1;
	}
	
	public Designer(String pnum, String name, int age, String job, String dept, int salary,String language, int workYear) {
		super(pnum, name, age, job, dept, salary);
		this.language = language;
		this.workYear = workYear;
	}
}

class Student extends Person {
	private String schoolName;
	private int schoolyear;
	private int scholarship;
	
	public void show() {
		System.out.println(super.toString()+":" +schoolName + ":" + schoolyear + ":" + scholarship);
	}
	
	public void increase() {
		this.scholarship += scholarship * 0.1;
	}
	
	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship) {
		super(pnum,name, age );
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}
	
}

class WorkStudent extends Student {
	private String job;
	private int dayPay;
	
	public void show() {
		System.out.println(super.toString() + ":" + job + ":" + dayPay);
	}
	public void increase() {
		this.dayPay += dayPay * 0.1;
	}

	public WorkStudent(String pnum, String name, int age, String schoolName, int schoolYear, int scholarship,
			String job, int dayPay) {
			super(pnum, name, age, schoolName, schoolYear, scholarship);
			this.job = job;
			this.dayPay = dayPay;
	}
	
}

public class TestPersons {
	static void showAll(Person[] p) {
		for(int i =0; i<p.length; i++) {
			p[i].show();
		}
	}
	static void increaseAll(Person[]p ) {
		for(int i=0; i<p.length; i++) {
			p[i].increase();
		}
	}

	static void getData(Person[]p) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Lee", 20, "프론트", "Design2", 3000, "Java", 40);
		Student s = new Student("p03", "Park", 30, "백엔드", 4000, 6);
		WorkStudent w = new WorkStudent("p04", "Kim", 40, "부산대", 5, 6, "풀스택", 6000);
		p[0]= e;
		p[1]= d;
		p[2]= s;
		p[3]= w;
	}
	
	public static void main(String[] args) {
		Person[] setPerson = new Person[4];
		getData(setPerson);
		showAll(setPerson);
		increaseAll(setPerson);
		showAll(setPerson);
	}

}
	
	
	


