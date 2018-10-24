package StringWork;


public class StringWork {

	public static void main(java.lang.String[] args) {

		String s1 = "abcd";
		String s2 = "123";
		String s3 = s1 + s2;                            // abcd123
		String s4 = s1.substring(2);                    // cd
		int x = s2.length();                            // 3
		String s5 = s1.toUpperCase();                   // ABCD
		char c = s1.charAt(0);                          // a
		int position = s1.indexOf("bc");                // 1
		String s6 = "aaaGGGccc".replace("GGG", "BBB");  // aaaBBBccc
		String s7 = "abcd";
		
		
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(x);
		System.out.println(s5);
		System.out.println(c);
		System.out.println(position);
		System.out.println(s6);
		
		System.out.println(s1.equals(s6)); //false
		System.out.println(s1.equals(s7)); //true
		
	}

}
