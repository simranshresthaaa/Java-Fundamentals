package ProgrammingFundamental;

import java.util.Scanner;

public class Question4 {

	void isOdd(int num) {
		if(num%2!=0) {
			System.out.println("Number is Odd.");
		}
		else {
			System.out.println("Number is not Odd.");
		}
		
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		Question4 even = new Question4();
		even.isOdd(num);

	}

}
