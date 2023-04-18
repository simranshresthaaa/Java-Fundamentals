package PatternProgramming;

public class Question7 {

	public static void main(String[] args) {
		int counter = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(counter + " ");
                counter++;
                if(counter > 50) 
                break;
            }
            System.out.println();
        }
    }
}