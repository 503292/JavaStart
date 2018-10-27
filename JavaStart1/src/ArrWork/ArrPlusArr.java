package ArrWork;

import java.util.Arrays;

// копіювання двох масивів в новий масив

public class ArrPlusArr {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4 };
		int[] y = { 5, 6, 7, 8 };

		int[] z = new int[x.length + y.length ];
		System.out.println(z.length);

		System.arraycopy(x, 0, z, 0, x.length);
		System.arraycopy(y, 0, z, x.length, y.length);
		

		System.out.println(Arrays.toString(z));

	}

}
