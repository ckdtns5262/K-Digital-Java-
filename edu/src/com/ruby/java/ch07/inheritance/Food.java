package com.ruby.java.ch07.inheritance;

public class Food {
	private String name;
	private int price;
	
	public Food() {
		System.out.println(name + ": ," + price +":" );
	}

	
	public Food(String name, int price) {
		
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}

	public static void main(String[] args) {	
		Food c =new Food();
		c.setName("치킨");
		c.setPrice(18000);
		System.out.println(c.toString()); //생성자가 없는 부분
		
		Food d = new Food("피자",50000);
		System.out.println(d.toString()); //생성자가 있는 부분
	}		
	
}
