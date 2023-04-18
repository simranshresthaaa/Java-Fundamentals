package PatternProgramming;

public class Question9 {

	public static void main(String[] args) {
		int k = 2;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (k != 51) {
					System.out.print(k + " ");
					k = k + 2;
				}
			}
			System.out.println();
		}

	}

}
