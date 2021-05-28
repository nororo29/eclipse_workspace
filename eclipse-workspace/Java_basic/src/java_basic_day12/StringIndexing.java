package java_basic_day12;

import java.util.StringTokenizer;

public class StringIndexing {

	public static void main(String[] args) {

		String str = "Java Programming";

		System.out.println("===========================indexOf()");
		System.out.println(str.indexOf("P"));
		System.out.println(str.indexOf("Program"));
		System.out.println(str.indexOf('v'));

		// lastIndexOf()
		System.out.println("===========================lastIndexOf()");
		System.out.println(str.lastIndexOf("g")); // 뒤에서부터
		System.out.println(str.lastIndexOf("gram"));

		// 자르기 substring()
		System.out.println("===========================substring()");
		System.out.println(str.substring(0, 6));
		System.out.println(str.substring(0, str.indexOf("gram")));

		// startsWith()
		System.out.println("===========================startsWith()");
		System.out.println(str.startsWith("java")); // 소문자
		System.out.println(str.startsWith("Ja")); // 대문자

		// trim
		System.out.println("===========================trim()");
		System.out.println("      hell".trim());
		System.out.println("hell      ".trim());
		System.out.println("      hell       ".trim());

		// split -> String[]
		System.out.println("===========================split()");
		str = "Java Programming is funny things...";
		String[] result = str.split(" ");

		for (String s : result) {
			System.out.println(s);
		}

		// StringTokenizer // 대량으로 할 때? ...  hasMoreTokens() / nextElement()...
		System.out.println("===========================StringTokenizer");
		StringTokenizer st = new StringTokenizer("this is a test");
	
		while(st.hasMoreTokens()) {
			System.out.println(st.nextElement());
		}
		
	}

}
