package ArrWork;

import java.util.Arrays;

public class ArrSort {

	public static void main(String[] args) {

		int[] a = new int[100];
		Arrays.fill(a, 50); // [50, 50 ... , 50]
		Arrays.sort(a);
		Arrays.sort(a, 50, 60);
		
		int[] x = {1, 2, 3, 4};
		int[] y = {1, 2, 3, 4};
		int[] z = {5, 6, 7, 8};
		System.out.println(Arrays.equals(x, y));  // true
		System.out.println(Arrays.equals(x, z));  // false
		
		int n = Arrays.binarySearch(x, 4); // 3 значення позиції
		System.out.println(n);
		
		String s = Arrays.toString(a);
		System.out.println(s);
		

	}

}
