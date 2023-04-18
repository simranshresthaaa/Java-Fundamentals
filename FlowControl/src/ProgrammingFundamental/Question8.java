package ProgrammingFundamental;

import java.util.Scanner;

public class Question8 {
	void checkPalindrome(int num) {
		int original = num;
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		if (original == reversed) {
			System.out.println(original + " is a palindrome");
		} else {
			System.out.println(original + " is not a palindrome");

		}
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		Question8 q = new Question8();
		q.checkPalindrome(num);

	}

}