package java_basic_day12;

public class SystemTest {

	public static void main(String[] args) {

		// nanoTime()
		//프로그램 시작시점 시간
		long start = System.nanoTime();
		
		//동작
		int sum = 0;
		for (int i = 0; i < 1000000000; i++) {
			sum += 1;
		}
		
		//프로그램 끝시점 시간
		long end = System.nanoTime();
		
		System.out.println("합: " + sum);
		System.out.println(start);
		System.out.println(end);
		System.out.println("프로그램 시간: " + (end - start) / 1000000000.0 + "초");
		
		
		
		// getProperty()
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		
		System.out.println("OS : " + osName);
		System.out.println("User : " + userName);
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.class.path"));
		
		// 모든 Property : getProperties()
		System.getProperties().list(System.out);
		
		// getenv()
		System.out.println(System.getenv("PATH"));
		
		
	}

}
