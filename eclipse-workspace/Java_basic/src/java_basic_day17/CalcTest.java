package java_basic_day17;

public class CalcTest {

	public static void main(String[] args) {

		Calc c1 = new CompleteCalculator();
		Calculator c2 = new CompleteCalculator();
//		Calculator c3 = new Calculator();

		System.out.println(c1.add(1, 1));
		System.out.println(c1.divide(1, 0));

		System.out.println(c2.add(1, 1));
		System.out.println(c2.divide(1, 0));

		System.out.println(c1 instanceof Calc); // t
		System.out.println(c1 instanceof Calculator); // t
		System.out.println(c1 instanceof CompleteCalculator); // t

		System.out.println(c2 instanceof Calc); // t
		System.out.println(c2 instanceof Calculator); // t
		System.out.println(c2 instanceof CompleteCalculator); // t

		// Calc - default method 재정의 가능
		c1.description(); // 디폴트 연산자 재정의 : CompleteCalculator
		c2.description(); // 디폴트 연산자 재정의 : CompleteCalculator

		
		// Calc - static method 
		System.out.println(Calc.total(new int[] { 1, 2, 3 }));
		// Calculator - 재정의 아님 - 새로운 static method
		Calculator.total(new int[] {1,2,3});
	}

}
