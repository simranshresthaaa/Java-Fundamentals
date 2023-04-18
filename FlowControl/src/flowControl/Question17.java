package flowControl;

import java.util.Scanner;

public class Question17 {
	void rev(int num) {
		int reverse = 0;
		while(num!=0) {
			  int digit = num % 10;
	            reverse = reverse * 10 + digit;
	            num /= 10;
	        }

	        System.out.println("Reversed number: " + reverse);
			
		}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		Question17 q = new Question17();
		q.rev(num);

	}

}
