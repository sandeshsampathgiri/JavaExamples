package JavaPrograms;

import java.util.Scanner;

//This program prints the largest of 3 numbers

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the 3 numbers");
		int a[] = new int[3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Entered numbers are:");
		for (int j = 0; j < 3; j++) {
			System.out.println(a[j]);
		}

	}

}
