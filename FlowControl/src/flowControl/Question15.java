package flowControl;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		int sum = 0;
		for (int i = num; i > 0; i /= 10) {
			sum += i % 10;
		}
		System.out.println(num + " > " + sum);
	}

}
