package ArrWork;

import java.util.Arrays;
import java.util.Scanner;

//1 ������� � ������ 10 �����
//2 ������ � ������ ����� ������� ������� � ����� � ��� ������
//3 ������ ������ �� ���������
//4 ������� �� �����

public class ArrCopyPaste {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 2, 5, 9, 1, 3, 4, 6, 346, 7, 10, 45,89, 8 };

		int[] arr1 = Arrays.copyOf(arr, arr.length / 2);
		int[] arr2 = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

		// ����������
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		// ���������� ������ � ������
		String s1 = Arrays.toString(arr1);
		String s2 = Arrays.toString(arr2);

		System.out.println("����� 1 = " + s1);
		System.out.println("����� 2 = " + s2);

	}
}
