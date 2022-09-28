package com.ruby.java.ch07.inheritance;

public class Drink {
	private String name;
	private int price;
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

	public String toString() {
		return name + "의" + "가격은" + price + "입니다";
	}
	
}
