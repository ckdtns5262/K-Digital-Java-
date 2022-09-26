package com.ruby.java.ch06;

public class AromorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		// private class 내에서만 호출 가능 
		suit1.setName("mark6");
		suit1.setHeight(180);

		suit2.setName("mark16");
		suit2.setHeight(220);

		suit3.setName("mark38");
		suit3.setHeight(200);

		System.out.println(suit1.getName() + " : " + suit1.getHeight());
		System.out.println(suit2.getName() + " : " + suit2.getHeight());
		System.out.println(suit3.getName() + " : " + suit3.getHeight());
	}
}
		

	
