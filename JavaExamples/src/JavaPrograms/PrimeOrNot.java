package JavaPrograms;

import java.util.Scanner;

//This program prints whether the entered number is prime or not

public class PrimeOrNot {

	public static void main(String[] args) {

		int flag = 0;
		System.out.println("Enter the number:");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("Entered number is prime");
		} else {
			System.out.println("Entered number is not prime");
		}

	}

}
