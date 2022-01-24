package week1.assignments;

public class Factorial {
	public static void main(String[] args) {
		int i;
		int factorial = 1;
		for (i = 5; i > 0; i--)
			factorial = factorial * i;
		System.out.println(factorial);
	}
}
