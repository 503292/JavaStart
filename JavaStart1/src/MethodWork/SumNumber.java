package MethodWork;

public class SumNumber {

	public static void main(String[] args) {

		int r = add(1, 5);
		System.out.println(" result: " + r);
		r = add(5, 8, 9, 10, 45);
		System.out.println(" result: " + r);

		System.out.println(" result: " + add(1, 5) + ", " + add(1, 2, 3, 4));
	}

	static int add(int x, int y) {
		return x + y;
	}

	static int add(int... n) {
		int sum = 0;
		for (int x : n) {
			sum += x;
		}
		return sum;
	}

}
