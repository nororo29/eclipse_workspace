package java_basic_day12;

public class StringConcatTest {

	public static void main(String[] args) {
		// nanoTime()
		// 프로그램 시작시점 시간

		String str1 = new String("Java");
		String str2 = "Programming";
		String result = "";

		long start = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			result += " ";
			result += str2;
		}

		long end = System.nanoTime();

		System.out.println("프로그램 시간: " + (end - start) / 1000000000.0 + "초");
		// 1초...
		System.out.println("==========================");

		start = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			result = str1.concat(" ");
			result = result.concat(str2);
		}

		System.out.println(result);

		end = System.nanoTime();

		System.out.println("프로그램 시간: " + (end - start) / 1000000000.0 + "초");
		// 0.02초...
		System.out.println("========================== StringBuilder사용");
		

		start = System.nanoTime();

		StringBuilder buffer = new StringBuilder(str1);

		for (int i = 0; i < 10000; i++) {
			buffer.append(" ");
			buffer.append(str2);
		}
		result = buffer.toString();

		end = System.nanoTime();

		System.out.println("프로그램 시간: " + (end - start) / 1000000000.0 + "초");
		// 0.003초...
	}

}
