package JavaPrograms;

import java.util.Scanner;

public class GetFactorial {

	public static void main(String[] args) {

		System.out.println("Enter the number");
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num == 0) {
			System.out.println("Factorial of 0 is 0");
		} else if (num == 1) {
			System.out.println("Factorial of 1 is 1");
		}

		else if (num > 1) {
			for (int i = num; i >= 2; i--) {
				factorial = factorial * i;
			}

			System.out.println("Factorial of " + num + " is " + factorial);
		}

	}

}
