package LoopsWork;

public class LoopThree {

	// вивести на екран всі числа які діляться на 3 без остатка
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 101; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
			
		}

	}

}
