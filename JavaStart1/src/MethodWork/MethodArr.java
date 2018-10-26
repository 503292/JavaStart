package MethodWork;

import java.util.Arrays;

// написати функцію яка приймає масив чисел в якості аргументу
// збільшує його перші три елемента на 1
// після змін виводимо на екран масив і суму

public class MethodArr {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(sumThreeValue(x));
		System.out.println(Arrays.toString(x));

	}

	static int sumThreeValue(int... x) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			x[i] = x[i] + 1;
			sum += x[i];
		}

		return sum;
	}

}
