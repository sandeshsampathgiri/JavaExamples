package Assignment3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int factorial = calculateFactorial(num);

		System.out.println("Factorial of " + num + " is: " + factorial);

	}

	public static int calculateFactorial(int num) {
		int fact = 1;

		if (num == 0) {
			return 0;
		}

		else if (num == 1) {
			return 1;
		} else if (num > 1) {

			for (int i = num; i >= 1; i--) {
				fact = fact * i;
			}
		}

		return fact;

	}

}
