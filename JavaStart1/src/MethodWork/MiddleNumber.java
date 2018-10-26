package MethodWork;

public class MiddleNumber {

	public static void main(String[] args) {

		double[] x = { 1.2, 1.3, 1.5, 6, 8 };
		System.out.println("Result: " + calc(x));

	}
	
	static double calc(double[] n) {
		double sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum / n.length;
	}

}
