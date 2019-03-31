package JavaPrograms;

import java.util.Scanner;

//This program is used to add 2 integers and print the sum
public class AddTwoIntegers {

	public static void main(String[] args) {

		System.out.println("Enter the first number");

		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();

		System.out.println("Enter the second number");

		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();

		int result = addTwoIntegers(num1, num2);

		System.out.println("Sum of two numbers=" + result);

	}

	public static int addTwoIntegers(int a, int b) {
		int sum = a + b;

		return sum;
	}

}
