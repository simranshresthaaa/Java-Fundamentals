package flowControl;

import java.util.Scanner;

public class Question4 {
	void character(char first, char second) {
		if (first < second) {
			System.out.println(first + "," + second);
		} else {
			System.out.println(second + "," + first);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first character: ");
		char first = scanner.next().charAt(0);
		System.out.print("Enter second character: ");
		char second = scanner.next().charAt(0);
		Question4 c = new Question4();
		c.character(first, second);

	}

}
