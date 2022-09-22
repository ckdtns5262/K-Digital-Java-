package com.ruby.java.test2;


public class Armor {
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	private String name2;
	private int phone;

	public String getName() {
		return name;
	}

	public Armor() {
		name = "jane";
	}
	
	public Armor(String name) {
		this.name =name;
	}
	
	public void setName(String name) {
		this.name = name; // this.name 써야 에러가 안남
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFly() {
		return isFly;
	}

	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}

	public Armor(String name, int height, int weight, String color, boolean isFly) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}

	public Armor(String name2, int phone) {
		super();
		this.name2 = name2;
		this.phone = phone;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Armor [name=" + name + ", height=" + height + ", weight=" + weight + ", color=" + color + ", isFly="
				+ isFly + ", name2=" + name2 + ", phone=" + phone + "]";
	}

	
	
	
}
