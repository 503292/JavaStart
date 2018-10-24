package ScannerConcat;

import java.util.Scanner;

public class ScannerConcat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = "";
		String s2 = "";
		String s3 = "";

		for (int i = 1; i < 4; i++) {

			System.out.println("Please enter String" + i);
			if (i == 1) {
				s1 = sc.nextLine();
				System.out.println("You printed " + s1);
			} else if (i == 2) {
				s2 = sc.nextLine();
				System.out.println("You printed " + s2);
			} else if (i == 3) {
				s3 = sc.nextLine();
				System.out.println("You printed " + s3);
			}

		}
		System.out.println("---------------");

		System.out.println(s1 + s2);
		System.out.println(s3 + s2 + s1);
		System.out.println(s1 + s2 + s3);
	}

}
