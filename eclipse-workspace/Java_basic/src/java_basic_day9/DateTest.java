package java_basic_day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		Date d;
		d = df.parse("2018-5-13");
		
		System.out.println(d); // Sun May 13 00:00:00 KST 2018
		System.out.println(df.format(d)); // 2018-05-13
	}

}
