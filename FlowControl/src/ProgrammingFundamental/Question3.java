package ProgrammingFundamental;

import java.util.Scanner;

public class Question3 {

	void isEven(int num) {
		if(num%2==0) {
			System.out.println("Number is even.");
		}
		else {
			System.out.println("Number is not even.");
		}
		
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = key.nextInt();
		Question3 even = new Question3();
		even.isEven(num);

	}

}
