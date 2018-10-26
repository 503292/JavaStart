package ArrWork;

// вивести суму масива без ПЕРШОГО і ОСТАННЬОГО елемента

public class IfZeroIfTenSum {

	public static void main(String[] args) {

		int[] x = { 100, 1, 1, 1, 1, 1, 1, 1, 1, 10 };
		int sum = 0;

		for (int i = 0; i < x.length; i++) {
			if (i == 0 || i == x.length - 1) {
				continue;
			}
			sum += x[i];

		}
		System.out.println(sum);
	}

}
