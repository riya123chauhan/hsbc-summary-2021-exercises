package com.hsbc.day3;

public class Circle implements Shape {

	@Override
	public String area(float radius) {
		double temp = Math.PI * radius * radius;

		String area = String.valueOf(temp);

		return area;
	}
}