package java_basic_day5;

public class InputParameter2 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.print((a + 100) + " " + (b % 10));
	}

}
