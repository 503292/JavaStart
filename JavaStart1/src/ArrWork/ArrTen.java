package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

public class ArrTen {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 8, 7, 10 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number # " + (i + 1));
			arr[i] = sc.nextInt();
		}

		// сортування
		Arrays.sort(arr);
		// приведення масива в строку
		String s = Arrays.toString(arr);
		
		System.out.println("Масив відсортовано");
		System.out.println(s);

	}

}
