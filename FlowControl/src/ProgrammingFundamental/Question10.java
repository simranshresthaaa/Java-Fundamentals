package ProgrammingFundamental;

public class Question10 {
	
	void isEven() {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Question10 even = new Question10();
		even.isEven();

	}

}
