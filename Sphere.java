package com.hsbc.day3;

public class Sphere implements Shape {

	@Override
	public String area(float radius) {
		double temp = 4 * Math.PI * radius * radius;

		String area = String.valueOf(temp);

		return area;
	}

}