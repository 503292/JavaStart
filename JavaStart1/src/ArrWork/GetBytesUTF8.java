package ArrWork;

import java.io.UnsupportedEncodingException;

public class GetBytesUTF8 {

	public static void main(String[] args) {
		
		String s = "abcde";
		
		byte[] b = null;
		
		try {
			b = s.getBytes("UTF-8");
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// ������ � ������
		String s1 = new String(b);
		System.out.println(s1);
		
		
		// ����� � ������
		char[] c = {'a', 'b', 'c', 'd'};
		String s2 = new String(c);
		System.out.println(s2);

	}

}
