package TimeDateWork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

	public static void main(String[] args) {
		
		Date dt = new Date(System.currentTimeMillis());
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		String res = sdf.format(dt);
		System.out.println(res);
		
		sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		res = sdf.format(dt);
		System.out.println(res);

		sdf = new SimpleDateFormat("dd.MM.yyyy DDD"); // day in year
		res = sdf.format(dt);
		System.out.println(res);
		
	}

}
