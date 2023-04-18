package flowControl;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a integer: ");
		int rows = key.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		// Using while loop
		int i = 1, j = 1;
		while (i <= rows) {
			while (j <= i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
			j = 1;
		}
	}
}