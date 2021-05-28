package java_basic_day12;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringFormatTest {

	public static void main(String[] args) {

		// %[argument_index$][flags][width] conversion

		System.out.printf("%10s %10s \n", "hello", "java");
		System.out.printf("%-10s %-20s \n", "hello", "java");

		System.out.printf("%2$s %1$s \n", "hello", "java"); // 출력순서변경

		System.out.printf("%,d %,d \n", 1000, 10000);
		
		
		// 날짜 format
		// SimpleDateFormat Class...
		// java.util.Date
		
		String form = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(form);
		
		Date dt = new Date();
		String now = dt.toString();
		System.out.println(now);
		System.out.println(sdf.format(dt));  // sdf.format(Date형)
		
		// 숫자 format
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(145678.16);
		System.out.println(result);
		
		// Calendar : singleton pattern // 단 하나의 인스턴스만 있음
		Calendar c = Calendar.getInstance();  // Calendar의 유일한 인스턴스 반환...
		
		c.get(Calendar.DAY_OF_WEEK);  // Calendar 상수
		System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 금요일 = 6 the day of the week
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // the day of the month
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); // 148 the day number within the current year.
		System.out.println(c.get(Calendar.AM_PM));
		
		
		

	}

}
