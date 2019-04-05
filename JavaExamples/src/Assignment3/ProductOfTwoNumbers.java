package Assignment3;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {

		int productResult = 1;

		System.out.println("Enter the two numbers:");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		int num2 = sc2.nextInt();

		productResult = calculateProduct(num1, num2);

		System.out.println("Product is " + productResult);

	}

	public static int calculateProduct(int num1, int num2) {
		int productResult = num1 * num2;
		return productResult;
	}

}
