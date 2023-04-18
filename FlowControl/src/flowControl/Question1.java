package flowControl;

import java.util.Scanner;

public class Question1 {
	Scanner key = new Scanner(System.in);
	
	
	void checkNum() {
		System.out.println("Enter a number");
		int num = key.nextInt();
		if(num>0) {
			System.out.println("Number is positive");
		}
		else if (num<0) {
			System.out.println("Number is negative");
		}
		else
		{
		System.out.println("You entered zero");
		}
			
	}
	public static void main(String[] args) {
		Question1 n = new Question1();
		n.checkNum();
	

	}

}