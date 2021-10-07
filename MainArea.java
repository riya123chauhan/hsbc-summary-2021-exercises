package com.hsbc.day3;

import java.util.Scanner;

public class MainArea {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String s = "y";

		while (s.equalsIgnoreCase("y")) {

			Circle circle = new Circle();
			Sphere sphere = new Sphere();

			System.out.println("Enter choice to find area");
			System.out.println("1. Area of circle");
			System.out.println("2. Area of sphere");
			int choice = sc.nextInt();

			FindArea fa = new FindArea();

			switch (choice) {
			case 1:
				sphere = null;
				fa.identifyShape(circle, sphere);
				break;

			case 2:
				circle = null;
				fa.identifyShape(circle, sphere);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue y/n");
			s = sc.next();

		}
	}
}