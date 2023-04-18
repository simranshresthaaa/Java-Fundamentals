package ProgrammingFundamental;

public class Question1 {
	void swap(int a, int b) {
		// without temp
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping, a is " + a + " " + "and b is " + b);
	}

	// with temp
	void swapTemp(int a, int b) {
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Using temp, After Swapping, a is " + a + " " + "and b is " + b);

	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		Question1 swap = new Question1();
		swap.swap(a, b);
		swap.swapTemp(a, b);

	}

}