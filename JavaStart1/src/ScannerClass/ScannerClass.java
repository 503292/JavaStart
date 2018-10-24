package ScannerClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter string: ");
		String s = scanner.nextLine();
		System.out.println("You printed: " + s);

		System.out.println();

		
			System.out.println("Enter integer: ");
			try {
				int x = scanner.nextInt();
				System.out.println("You printed: " + x);
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
			
		
	}
}
