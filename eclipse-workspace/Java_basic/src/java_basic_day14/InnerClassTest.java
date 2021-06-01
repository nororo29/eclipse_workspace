package java_basic_day14;

import java.util.Date;

public class InnerClassTest {

	public void printStatus() {
		// inner class
		class DateFormat {
			private Date date;

			public DateFormat(Date date) {
				this.date = date;
			}

			public String getDateFormat() {
				return date.toString();
			}
		}

		DateFormat format = new DateFormat(new Date());
		System.out.println("The Date : " + format.getDateFormat());

	}

	public static void main(String[] args) {

		InnerClassTest ic1 = new InnerClassTest();
		ic1.printStatus();
		
	}

}
