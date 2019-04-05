package Assignment3;

import java.util.*;

public class FindMaxAndMin {

	public static void main(String[] args) {

		System.out.println("Enter the numbers:");

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		int num1 = sc1.nextInt();
		int num2 = sc2.nextInt();
		int num3 = sc3.nextInt();

		int min = calcMinNumber(num1, num2, num3);
		int max = calcMaxNumber(num1, num2, num3);

		System.out.println("Highest number is " + max);
		System.out.println("Least number is " + min);

	}

	public static int calcMaxNumber(int num1, int num2, int num3) {
		if ((num1 >= num2) && (num1 >= num3)) {
			return num1;

		}

		else if ((num2 >= num3) && (num2 >= num1)) {
			return num2;
		}

		else if ((num3 >= num1) && (num3 >= num2)) {
			return num3;
		}
		return num3;
	}

	public static int calcMinNumber(int num1, int num2, int num3) {
		if ((num1 <= num2) && (num1 <= num3)) {
			return num1;

		}

		else if ((num2 <= num3) && (num2 <= num1)) {
			return num2;
		}

		else if ((num3 <= num1) && (num3 <= num2)) {
			return num3;
		}
		return num3;
	}
}
