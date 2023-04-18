package ProgrammingFundamental;

import java.util.Scanner;

public class Question7 {

	void checkArmstrong(int num) {
		int num2 = num;
		int result = 0;
		int n = 0;
		while (num2 != 0) {
			num2 /= 10;
			++n;
		}
		num2 = num;
		while (num2 != 0) {
			int remainder = num2 % 10;
			result += Math.pow(remainder, n);
			num2 /= 10;
		}
		if (result == num) {
			System.out.println(num + " is an Armstrong number.");
		} else {
			System.out.println(num + " is not an Armstrong number.");
		}
	}

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = key.nextInt();
		Question7 arm = new Question7();
		arm.checkArmstrong(num);

	}

}
