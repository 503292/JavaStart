package ArrWork;

import java.util.Arrays;

// заповнити масив числами від 100 до 0

public class ArrHundredZero {

	public static void main(String[] args) {
		int[] x = new int[101];

		for (int i = 100, j = 0; i > 0; j++, i--) {
			x[j] = i;
		}
		System.out.println(Arrays.toString(x));

	}

}
