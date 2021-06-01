package java_basic_day14;

interface Calc {
	public int add(int num1, int num2);
}

public class LambdaTest {

	public static void main(String[] args) {

		// 람다식을 인터페이스 인스턴스에 대입 후 사용
		Calc lambdaCalc = (a, b) -> a + b;
		System.out.println(lambdaCalc.add(3, 5));

		// 메서드의 매개변수에...
		showMyLambda(lambdaCalc);

		// 반환 값으로...
		Calc reLambda = returnMyLambda();
		System.out.println(reLambda.add(3, 9));
	}

	public static void showMyLambda(Calc c) {// 매개변수 인터페이스형 받음
		System.out.println(c.add(2, 9));
	}
	
	public static Calc returnMyLambda() {
		return (a, b) -> a + b;
	}

}
