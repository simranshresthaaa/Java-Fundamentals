package flowControl;

import java.util.Scanner;

public class Question2 {
	void isEven(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = key.nextInt();
		Question2 oe = new Question2();
		oe.isEven(num);

	}

}
