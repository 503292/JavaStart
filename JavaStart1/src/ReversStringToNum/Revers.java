package ReversStringToNum;

public class Revers {

	public static void main(String[] args) {
		String s1 = Integer.toString(777);                   // "777"
		String s2 = Long.toString(8888888);                  // "8888888"
		String s3 = Integer.toString(222, 16).toUpperCase(); // DE
		
		int a = Integer.parseInt("555");                     // 555
		long b = Long.parseLong("258525456454");             // 258525456454
		int c = Integer.parseInt("DE", 16);                  // 222
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
