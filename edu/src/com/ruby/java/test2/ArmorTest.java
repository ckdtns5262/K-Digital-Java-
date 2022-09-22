package com.ruby.java.test2;

public class ArmorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armor armor = new Armor();
		System.out.println("name :" + armor.getName());
		System.out.println(""+ armor.toString());
		
		Armor armor1 =new Armor("홍길동");
		System.out.println("name : " + armor1.getName());
		//(String name, int height, int weight, String color, boolean isFly)
		
		Armor armor2 = new Armor("홍홍",100,100,"Red", true);
		System.out.println("name : "  + armor2.getName());
		System.out.println("weight :" + armor2.getWeight());
		System.out.println("height : "+ armor2.getHeight());
		System.out.println("color : "+ armor2.getColor());
		System.out.println(""+ armor2.toString());
		
		Armor armor3 = new Armor("홍홍홍홍", 45645456);
		System.out.println("name :" + armor3.getName2());
		System.out.println("phone :"+ armor3.getPhone());
		
		// height
		armor.setHeight(100);
		int h = armor.getHeight();
		System.out.println("My height is " + h);
	
		// weight
		armor.setWeight(200);
		int w = armor.getWeight();
		System.out.println("My weight is "+ w);
		
		//color
		armor.setColor("white");
		String c =armor.getColor();
		System.out.println("Color is "+ c);
		
		
		

}
}