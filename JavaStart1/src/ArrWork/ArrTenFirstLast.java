package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

//1 вводимо з консолі 10 чисел
//2 копіюєм з масива першу частину пополам і другу в нові масиви
//3 сортуєм масиви які скопіювали
//4 виводим на екран

public class ArrTenFirstLast {

	public static void main(String[] args) {

		int temp;

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 8, 7, 10 };

		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		String s = Arrays.toString(arr);
		System.out.println(s);

		// сортування
		Arrays.sort(arr);
		// приведення масива в строку
		String s1 = Arrays.toString(arr);

		System.out.println("Масив відсортовано");
		System.out.println(s1);

	}

}
