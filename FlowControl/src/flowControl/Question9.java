package flowControl;

import java.util.Scanner;

public class Question9 {
	void getMonthName(int monthNum) {
		switch(monthNum) {
		case 1:
			System.out.println("Month name: January");
			break;
		 case 2:
             System.out.println("Month name: February");
             break;
         case 3:
             System.out.println("Month name: March");
             break;
         case 4:
             System.out.println("Month name: April");
             break;
         case 5:
             System.out.println("Month name: May");
             break;
         case 6:
             System.out.println("Month name: June");
             break;
         case 7:
             System.out.println("Month name: July");
             break;
         case 8:
             System.out.println("Month name: August");
             break;
         case 9:
             System.out.println("Month name: September");
             break;
         case 10:
             System.out.println("Month name: October");
             break;
         case 11:
             System.out.println("Month name: November");
             break;
         case 12:
             System.out.println("Month name: December");
             break;
         default:
        	 System.out.println("Invalid input");
			
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month number: ");
        int monthNum = scanner.nextInt();
        Question9 month = new Question9();
        month.getMonthName(monthNum);
		

	}

}
