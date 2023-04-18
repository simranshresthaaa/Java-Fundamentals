package flowControl;

import java.util.Scanner;

public class Question14 {

	void checkPrime(int num) {
		if (num < 2) {
			System.out.println(num + " is neither prime nor composite.");
			return;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not a prime number.");
				return;
			}
		}
		System.out.println(num + " is a prime number. ");

	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = key.nextInt();
		Question14 q = new Question14();
		q.checkPrime(num);

	}

}
