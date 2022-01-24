package week1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1, range = 8;
		int sum;
		System.out.println(a);
		for (int i = 0; i <= range; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(a);
		}
	}
}
