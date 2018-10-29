package TimeDateWork;

import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date dt1 = new Date(2014-1900, 7, 25); // ������ ���������� � 0 �� 11 (����� ������ 8 �����)
		System.out.println(dt1);
		
		long ctm = System.currentTimeMillis(); // ������� ���� � �����
		System.out.println(ctm); // ����� � ����������� ������ long - (1540805217388)
		Date dt2 = new Date(ctm);
		System.out.println(dt2);
		
		System.out.println(dt1.equals(dt2));     // ��������� �� ���������
		System.out.println(dt1.compareTo(dt2));  // dt1 < dt2
		System.out.println(dt2.compareTo(dt1));  // dt2 > dt1
		System.out.println(dt2.compareTo(dt2));  // dt2 == dt2
 		
	}

}
