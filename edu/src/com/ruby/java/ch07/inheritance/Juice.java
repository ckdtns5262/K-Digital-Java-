package com.ruby.java.ch07.inheritance;

public class Juice extends Drink {
	private String name;
	private int price;
	
	public Juice() {
		System.out.println();
	}
	
	public String getName() {
	return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
	this.price = price;
	}

	public void setName(String name) {
	this.name = name;

	}
	public String toString() {
		return super.toString();
	}

	
}
