package com.ruby.java.ch06;
class Count {
	public static int totalCount; // static 선언시
	int count;				//default 선언자
}
public class CountTest {
	
		public static void main(String[] args) {
			
			Count.totalCount= 10;
			
			Count c1 = new Count();
			Count c2 = new Count();
			Count c3 = new Count();

			c1.count ++;
			Count.totalCount++;
			c2.count++;
			Count.totalCount++;
			c3.count++;
			Count.totalCount++;

			System.out.println(Count.totalCount + " : " + c1.count);
			System.out.println(Count.totalCount + " : " + c2.count);
			System.out.println(Count.totalCount + " : " + c3.count);
		}
	
	}


