package Assignment3;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the 2 numbers");

		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();

		int result = calculateSum(num1, num2);
		System.out.println("Result is: " + result);

	}

	public static int calculateSum(int num1, int num2) {
		int result = num1 + num2;
		return result;

	}

}
