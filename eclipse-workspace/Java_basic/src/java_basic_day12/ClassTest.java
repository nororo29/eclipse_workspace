package java_basic_day12;

import java.lang.reflect.Method;
import java.util.Calendar;

public class ClassTest {

	public static void main(String[] args) {

		// Class 정보얻기1
		String s = new String();
		Class c = s.getClass();

		Method[] m = c.getMethods(); // import java.lang.reflect.Method;

		for (Method method : m) {
			System.out.println(method.getName());
		}

		// Class 정보얻기2
		c = String.class;
		c = Calendar.class;

		// Class 정보얻기3
		try {
			c = Class.forName("java_basic_day12.SystemTest");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(c.getName());

	}

}
