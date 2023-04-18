package flowControl;

import java.util.Scanner;

public class Question20 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice;
		do {
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("Enter your choice: ");
			int ch = input.nextInt();
			int num1, num2, result;
			switch (ch) {
			case 1:
				System.out.println("Enter two numbers: ");
				num1 = input.nextInt();
				num2 = input.nextInt();
				result = add(num1, num2);
				System.out.println("Result: " + result);
				break;
			case 2:
				System.out.println("Enter two numbers: ");
				num1 = input.nextInt();
				num2 = input.nextInt();
				result = sub(num1, num2);
				System.out.println("Result: " + result);
				break;
			default:
				System.out.println("Invalid choice.");
			}
			System.out.println("Do you want to continue? (y/n)");
			choice = input.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');
	}
}