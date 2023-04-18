package PatternProgramming;

public class Question10 {

	public static void main(String[] args) {
		String s = "abcdef";
		for (int i = 1; i <= 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(s.charAt(j));
			}

			System.out.println();
		}

	}
}