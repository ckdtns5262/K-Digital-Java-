package com.ruby.java.test1;

public class Gradeur extends Car {

	@Override
	public void start() {
		System.out.println("Gradeur 시동을 킨다");
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Gradeur 달린다");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Gradeur 멈춘다");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("Gradeur 시동을 끈다");
	}
	
}
