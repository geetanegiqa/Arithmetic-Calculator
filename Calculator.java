package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double a = Scanner.nextDouble();
		System.out.println("Enter Second Number: ");
		double b = Scanner.nextDouble();
		System.out.println("Choose options:");
		System.out.println("1. Addition");
		System.out.println("2. Subraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = Scanner.nextInt();
		double result;
		switch (choice) {
		case 1: {
			result = a + b;
			System.out.println("Result is : " + result);
			break;
		}
		case 2: {
			result = a - b;
			System.out.println("Result is : " + result);
		}
		case 3: {
			result = a * b;
			System.out.println("Result is : " + result);
		}
		case 4: {
			if (b != 0) {
				result = a / b;
				System.out.println("Result is : " + result);
			} else {
				System.out.println("Cannot Divide with Zero");
			}
			break;
		}
		}

		Scanner.close();
	}

}
