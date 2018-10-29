package ArrWork;

import java.util.Arrays;

public class BubblesSort {

	public static void main(String[] args) {
		int[] a = { 5, 8, 3, 6, 1, 9 };
		bubbleSort(a);
		//System.out.println(Arrays.toString(a));
	}

	// FUNCTION
	public static void swap(int[] a, int x, int y) {
		int tmp = a[x];
		a[x] = a[y];
		a[y] = tmp;
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if(a[j] > a[j + 1]) {
					swap(a, j, j + 1);
					System.out.println(Arrays.toString(a));
				}
			}

		}
	}
}
