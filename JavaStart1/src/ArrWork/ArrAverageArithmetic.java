package ArrWork;

import java.util.Arrays;

// вивести середнє арифметичне масива

public class ArrAverageArithmetic {

	public static void main(String[] args) {

		int allNum = 0;
		int average;

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 346, 7, 10 };

		for (int i = 0; i < arr.length; i++) {
			allNum += arr[i];
		}

		average = allNum / arr.length;

		System.out.println(average);

	}

}
