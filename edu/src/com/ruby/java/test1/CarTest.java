package com.ruby.java.test1;

import java.util.ArrayList;

public class CarTest {

	public static void main(String[] args) {

		ArrayList<Car> carList = new ArrayList<Car>();

		carList.add(new Sonata());
		carList.add(new Gradeur());

		for (Car car : carList) {
			car.run();
		}
	}

}
