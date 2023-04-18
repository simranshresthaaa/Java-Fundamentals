package flowControl;

import java.util.Scanner;

public class Question3 {
	  public void checkArguments() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter command line arguments: ");
	        String input = scanner.nextLine();
	        if (input.isEmpty()) {
	            System.out.println("No Values");
	        } else {
	            String[] inputArr = input.split(" ");
	            for (int i = 0; i < inputArr.length; i++) {
	                System.out.print(inputArr[i]);
	                if (i < inputArr.length - 1) {
	                    System.out.print(",");
	                }
	            }
	        }
	        scanner.close();
	    }

	    public static void main(String[] args) {
	        Question3 q = new Question3();
	        q.checkArguments();
	    }
	}