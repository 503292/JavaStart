package TimeDateWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println("Year: " + c.get(Calendar.YEAR));
		System.out.println("Month: " + (c.get(Calendar.MONTH) + 1)); // 0..11
		System.out.println("Day: " + c.get(Calendar.DAY_OF_MONTH));

		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, 2);
		c.add(Calendar.DAY_OF_MONTH, -2);

		Date dt = c.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String res = sdf.format(dt);
		System.out.println(res);

	}

}
