package com.hsbc.day3;

import java.util.Scanner;

public class FindArea {

	public void identifyShape(Circle c, Sphere s) {

		// Identify the choice of the user
		Scanner sc = new Scanner(System.in);

		if (c != null) {
			System.out.println("Enter the radius of circle");
			float radius = sc.nextFloat();
			String result = c.area(radius);
			System.out.println("The area of the circle is: " + result);
		}

		if (s != null) {
			System.out.println("Enter the radius of sphere");
			float radius = sc.nextFloat();
			String result = s.area(radius);
			System.out.println("The area of the sphere is: " + result);
		}
	}
}