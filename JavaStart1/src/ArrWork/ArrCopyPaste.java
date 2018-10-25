package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

//1 вводимо з консолі 10 чисел
//2 копіюєм з масива першу частину пополам і другу в нові масиви
//3 сортуєм масиви які скопіювали
//4 виводим на екран

public class ArrCopyPaste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 346, 7, 10, 45,89, 8 };

		int[] arr1 = Arrays.copyOf(arr, arr.length / 2);
		int[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

		// сортування
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// приведення масива в строку
		String s1 = Arrays.toString(arr1);
		String s2 = Arrays.toString(arr2);

		System.out.println("Масим 1 = " + s1);
		System.out.println("Масим 2 = " + s2);

	}
}
