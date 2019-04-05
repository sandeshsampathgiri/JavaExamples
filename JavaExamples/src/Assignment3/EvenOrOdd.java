package Assignment3;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is even");
		}
		else
		{
			System.out.println("Entered number is odd");
		}

	}

}
