package TimeDateWork;

import java.util.Date;

public class DateAndTime {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date dt1 = new Date(2014-1900, 7, 25); // месяцы нумеруются с 0 до 11 (здесь указан 8 месяц)
		System.out.println(dt1);
		
		long ctm = System.currentTimeMillis(); // текущая дата и время
		System.out.println(ctm); // вывод в розмерности одного long - (1540805217388)
		Date dt2 = new Date(ctm);
		System.out.println(dt2);
		
		System.out.println(dt1.equals(dt2));     // сравнение на равенство
		System.out.println(dt1.compareTo(dt2));  // dt1 < dt2
		System.out.println(dt2.compareTo(dt1));  // dt2 > dt1
		System.out.println(dt2.compareTo(dt2));  // dt2 == dt2
 		
	}

}
