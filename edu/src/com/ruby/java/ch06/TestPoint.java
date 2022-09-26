package com.ruby.java.ch06;

class Point {
	
	public Point() {
		super();
		
	}
	private int x, y;
	
	public Point(int a, int b) {
		x = a; y = b;
		System.out.println(x + y);
	}	
	public int getX()  {
		return x;
	}

	public int getY() {
		return y;
	}


}








class ColorPoint extends Point {
	private String color;
	private int x, y;
	
	public ColorPoint(int a, int b , String s) {
		super(a,b);
		color = s;
		System.out.println(a + b +s+"입니다");
	}
	
	
}

public class TestPoint {

	public static void main(String[] args) {
	Point s = new Point(10,20);
	ColorPoint c = new ColorPoint(10, 20, "보라색");
		
		
	}

}
