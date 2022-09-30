package Pra;

abstract class Person{
	private String punm;
	private String name;
	private int age;

	public Person(String pnum, String name, int age) {
		this.punm = pnum;
		this.name = name;
		this.age = age;
	}
	
	abstract void show(); 
	abstract void increase();

	@Override
	public String toString() {
		return "Person [punm=" + punm + ", name=" + name + ", age=" + age + "]";
	}
}

class Employee extends Person{
	private String job;
	private String dept;
	private int salary;
	
	public Employee(String pnum, String name, int age, String job, String dept, int salary) {
		super(pnum, name, age);
		this.job = job;
		this.dept = dept;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Employee [job=" + job + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public void increase() {
		this.salary += (this.salary) * 0.1;
	}
	public void show() {
		System.out.println(this.toString());
	} 
}

class Desinger extends Employee {
	private String language;
	private int workYear;
	
	public Desinger(String pnum, String name, int age, String job, String dept, int salary, String language, int workYear) {
		super(job, dept, salary, pnum, name, age);
		this.language = language;
		this.workYear = workYear;
	}

	@Override
	public String toString() {
		return super.toString()+"Desinger [language=" + language + ", workYear=" + workYear + "]";
	}
	
	
	public void show() {
		System.out.println(this.toString());
	}

}
class Student extends Person {
	private String schoolName;
	private int schoolyear;
	private int scholarship;
	
	public Student(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship ) {
		super(pnum, name, age);
		this.schoolName = schoolName;
		this.schoolyear = schoolyear;
		this.scholarship = scholarship;
	}

	@Override
	public String toString() {
		return super.toString()+ "Student [schoolName=" + schoolName + ", schoolyear=" + schoolyear + ", scholarship=" + scholarship
				+ "]";
	}
	
	public void increase() {
		this.scholarship += (this.scholarship)*0.1;
	}
	
	public void show() {
		System.out.println(this.toString());
	}
}

class WorkStudent extends Student {
	 private String job;
	 private int dayPay;
	 
	 public WorkStudent(String pnum, String name, int age, String schoolName, int schoolyear, int scholarship, String job, int dayPay ) {
		 super(pnum, name, age, schoolName, schoolyear, scholarship);
		 this.job= job;
		 this.dayPay =dayPay;
	 }

	@Override
	public String toString() {
		return super.toString()+"WorkStudent [job=" + job + ", dayPay=" + dayPay + "]";
	}
	 
	public void show() {
		System.out.println(this.toString());
	}
	
	public void increase() {
		this.dayPay +=  (this.dayPay) *0.1;
	}
	 
}

public class TestPersons {
	static void showAll(Person[] p) {
        for (int i=0; i<p.length; i++) {
      	 p[i].show(); 
      	 
        }
    }
	static void increaseAll(Person[] p) {
        for (int i=0; i<p.length; i++) {
      	 p[i].increase(); 
        }
    }
	static void getData(Person[] p) {
		Employee e = new Employee("p01", "Hong", 10, "DB", "Design", 2000);
		Desinger d = new Desinger("p02", "kim",20, "프론트개발자","Deesign2",3000,"자바스크립트",4);
		Student s = new Student("p03", "Lee",30, "부산대",4, 5);
		WorkStudent w = new WorkStudent("p04", "Yoon",40, "부경대", 3, 4,"개발자",4000);
		

		
	}
	
	public static void main(String[] args) {
	
		Person[] setPerson = new Person[1];
		

	}

}
