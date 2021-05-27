package java_basic_day11;

public class Computer extends Calculator {

	@Override
	public double areaCircle(double r) {
		return Math.PI * r * r;
	}
	
	
	
	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("내 계산 : " + calculator.areaCircle(r));
		
		Computer computer = new Computer();
		System.out.println("컴퓨터 계산 : " + computer.areaCircle(r));
	}
}
