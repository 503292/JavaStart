package ArrWork;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int count = 0;
		int temp;

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 346, 7, 10 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
