package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

//1 ������� � ������ 10 �����
//2 ������ � ������ ����� ������� ������� � ����� � ��� ������
//3 ������ ������ �� ���������
//4 ������� �� �����

public class ArrTenFirstLast {

	public static void main(String[] args) {

		int temp;

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 8, 7, 10 };

		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		String s = Arrays.toString(arr);
		System.out.println(s);

		// ����������
		Arrays.sort(arr);
		// ���������� ������ � ������
		String s1 = Arrays.toString(arr);

		System.out.println("����� �����������");
		System.out.println(s1);

	}

}
