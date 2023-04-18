package flowControl;

import java.util.Scanner;

public class Question6 {

	public void calculateInterest(String gender, int age) {

		if (gender.equalsIgnoreCase("Female")) {
			if (age >= 1 && age <= 58) {
				System.out.println("Interest = 8.2%");
			} else if (age >= 59 && age <= 120) {
				System.out.println("Interest = 7.6%");
			}
		} else if (gender.equalsIgnoreCase("Male")) {
			if (age >= 1 && age <= 60) {
				System.out.println("Interest = 9.2%");
			} else if (age >= 61 && age <= 120) {
				System.out.println("Interest = 8.3%");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Gender: ");
		String gender = scanner.nextLine();
		System.out.print("Enter Age: ");
		int age = scanner.nextInt();
		Question6 q = new Question6();
		q.calculateInterest(gender, age);

	}
}
