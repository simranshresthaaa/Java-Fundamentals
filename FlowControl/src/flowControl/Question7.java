package flowControl;

import java.util.Scanner;

public class Question7 {
	void convertCase(char character) {
		char character2;
		if (Character.isUpperCase(character)) {
			character2 = Character.toLowerCase(character);
		} else {
			character2 = Character.toUpperCase(character);
		}
		System.out.println("Old character: " + character + " New character: " + character2);
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a character");
		char character = key.next().charAt(0);
		Question7 q = new Question7();
		q.convertCase(character);

	}

}
