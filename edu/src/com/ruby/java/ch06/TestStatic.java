package com.ruby.java.ch06;

public class TestStatic {
	static void show(int a[][]) {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=a.length; j++) {
		System.out.println(a.length);
		
	}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3} , {4,5,6}, {7,8,9}};
		show(a);
		TestStatic.show(a);
	}

}
