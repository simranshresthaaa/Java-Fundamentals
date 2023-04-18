package ProgrammingFundamental;

import java.util.Scanner;

public class Question6 {
	void factorial(int num) {
		int fact = 1;
		for(int i =1; i<=num; i++) {
			fact = fact*i;
		}
		
		
		System.out.println("Factorial of " + num + " is " + fact);
			
		}
	
	
	

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = key.nextInt();
		Question6 factorial = new Question6();
		factorial.factorial(num);

	}

}
