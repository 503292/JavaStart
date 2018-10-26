package ArrWork;

public class ArrPrintElement {

	public static void main(String[] args) {

		int[] x = new int[28];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = i * 365;
		}
		
		System.out.println(x[0]);
		System.out.println(x[14]);
		System.out.println(x[x.length - 1]);

	}

}
