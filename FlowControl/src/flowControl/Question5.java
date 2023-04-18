package flowControl;

import java.util.Scanner;

public class Question5 {
	void checkCharacter(char input) {
		if (Character.isLetter(input)) {
			System.out.println("Alphabet");
		} else if (Character.isDigit(input)) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}

	}

	public static void main(String[] args) {
		Question5 q = new Question5();
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a character:");
		char input = key.next().charAt(0);
		q.checkCharacter(input);
		key.close();

	}

}
