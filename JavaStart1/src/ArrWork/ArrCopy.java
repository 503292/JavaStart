package ArrWork;

import java.util.Arrays;

public class ArrCopy {

	public static void main(String[] args) {
		 
		char[] a = new char[] {'A', 'B', 'C', 'D', 'E'};
		char[] b = new char[5];
		
		System.arraycopy(a, 0, b, 0, a.length);
		
		System.out.println(b);
		
		char[] c1 = Arrays.copyOf(a, a.length);  // ABCDE
		char[] c2 = Arrays.copyOf(a, 2);         // AB
		char[] c3 = Arrays.copyOfRange(a, 2, 5); // CDE

	}

}
