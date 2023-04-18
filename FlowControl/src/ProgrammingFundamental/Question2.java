package ProgrammingFundamental;

public class Question2 {
	void swap(int a, int b, int c) {
		// without temp
		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);
		System.out.println("After Swapping, a is " + a + " " + "and b is " + b + "and c is " + c);
	}

	// with temp
	void swapTemp(int a, int b, int c) {
		int temp;
		temp = a;
		a = c;
		c = b;
		b = temp;
		System.out.println("Using temp, After Swapping, a is " + a + " " + "and b is " + b + "and c is " + c);

	}

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		Question2 swap = new Question2();
		swap.swap(a, b, c);
		swap.swapTemp(a, b, c);

	}

}