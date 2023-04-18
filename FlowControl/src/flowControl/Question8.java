package flowControl;

import java.util.Scanner;

public class Question8 {

	void cName(String code) {
		switch (code) {
		case "R":
			System.out.println("Color name: Red");
			break;
		case "B":
			System.out.println("Color name: Blue");
			break;
		case "G":
			System.out.println("Color name: Green");
			break;
		case "O":
			System.out.println("Color name: Orange");
			break;
		case "Y":
			System.out.println("Color name: Yellow");
			break;
		case "W":
			System.out.println("Color name: White");
			break;
		default:
			System.out.println("Invalid Code");
		}

	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter color code: ");
		String code = key.next();
		Question8 q = new Question8();
		q.cName(code);
	}

}
