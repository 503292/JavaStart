package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

// програма яка робить дзеркальний масив

public class ArrMirror {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of mirror array: ");
		int k = sc.nextInt();
		int[] x = new int[k];

		if (k % 2 == 0) {
			for (int i = 0, j = k / 2; i < x.length; i++, j--) {
				x[i] = j;
				if (x[i] == 1) {
					++i;
					x[i] = j;
					for (int j2 = 1; j2 < x.length / 2 + 1; j2++, i++) {
						x[i] = j2;
					}
					// break;
				}
			}

		} else {
			for (int i = 0, j = k / 2; i < x.length; i++, j--) {

				x[i] = j;
				if (x[i] == 0) {
					for (int j2 = 0; j2 < x.length / 2 + 1; j2++, i++) {
						x[i] = j2;
					}
					// break;
				}

			}

		}
		System.out.println(Arrays.toString(x));

	}

}
