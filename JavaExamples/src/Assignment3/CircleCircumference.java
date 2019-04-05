package Assignment3;

import java.util.Scanner;

public class CircleCircumference {

	final static double pi = 3.14;

	public static void main(String[] args) {

		System.out.println("Enter the radius");
		Scanner sc = new Scanner(System.in);
		float radius = sc.nextFloat();

		double circumference = calculateCircumference(radius);
		System.out.println("Circumference of the circle is: " + circumference);

	}

	public static double calculateCircumference(float radius) {

		double circumference = 2 * pi * radius;
		return circumference;
	}

}
