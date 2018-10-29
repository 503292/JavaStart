package StringWork;

public class FormatString {

	public static void main(String[] args) {
		String s1 = "string";
		int n = 20;
		
		String res = String.format("String: %s, number: %d", s1, n);

		System.out.println(res);
	}

}
