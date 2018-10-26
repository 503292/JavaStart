package ArrWork;

import java.util.Random;

public class ArrRandom {

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 5) {
				sum += arr[i];
			}
		}
		System.out.println("Ñóììà = " + sum);

	}

}
