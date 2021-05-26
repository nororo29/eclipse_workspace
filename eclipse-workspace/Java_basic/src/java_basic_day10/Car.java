package java_basic_day10;

public class Car {
	protected String carName;
	protected int engine;
	
	public Car() {
		this("이름없음", -1);
	}
	public Car(String carName, int engine) {
		this.carName = carName;
		this.engine = engine;
	}
	
	public void run() {
		System.out.println(carName + "가 달린다.");
	}
	
}
