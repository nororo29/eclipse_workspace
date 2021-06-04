package java_basic_day17;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999;
	
	int add(int n1, int n2);
	int substract(int n1, int n2);
	int divide(int n1, int n2);
	int times(int n1, int n2);
	
	static int total(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}
	
	default void description() {
		System.out.println("디폴트 연산자...계산시...");
	}
}

abstract class Calculator implements Calc {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}
	
	@Override
	public void description() {
		System.out.println("디폴트 연산자 재정의 : Calculator...");
	}
	
	static int total(int[] arr) {
		System.out.println("total...");
		return 1;
	}
	
}

class CompleteCalculator extends Calculator {

	@Override
	public int divide(int n1, int n2) {
		if (n2 == 0)
			return ERROR;
		return n1 / n2;
	}
	
	@Override
	public void description() {
		System.out.println("디폴트 연산자 재정의 : CompleteCalculator");
	}

}


