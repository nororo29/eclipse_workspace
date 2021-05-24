package java_basic_day5;

public class InputParameter {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		System.out.println("sum : " + (a + b + c));
		System.out.println("avg : " + (a + b + c) / 3);

	}

}
