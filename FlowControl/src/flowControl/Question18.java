package flowControl;

import java.util.Scanner;

public class Question18 {
	void checkPalindrome(int num) {
		int original = num;
		int reversed =0;
		while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
		
        }
	}

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		Question18 q = new Question18();
		q.checkPalindrome(num);

	}

}
