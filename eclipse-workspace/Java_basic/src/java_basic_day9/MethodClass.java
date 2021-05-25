package java_basic_day9;

public class MethodClass {

	public int add(int n1, int n2) {
		int result;
		result = n1 + n2;

		return result;
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	public int getTenTotal() {
		return 10 * 10;
	}

	public void printTenTotal() {
		int total = getTenTotal();
		System.out.println(total);
	}

	public void printGreeting(String name) {
		System.out.println(name);
		return;  // void 반환
	}

	public void divide(int n1, int n2) {
		if (n2 == 0) {
			System.out.println("0으로 나눌 수 없다");
			return;  // code break 의미
		} else {
			System.out.println(n1 / n2);
		}
	}

}
