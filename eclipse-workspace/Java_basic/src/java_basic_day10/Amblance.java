package java_basic_day10;

public class Amblance extends Car {

	boolean kit;
	
	public Amblance() {  // this로 상위클래스 변수접근
		this.carName = "Amblance";
		this.engine = 10000;
	}
	public Amblance(boolean kit) {  // super로 상위클래스 생성자 호출
		super("Amblance", 10000);
		this.kit = kit;
	}

	public void siren() {
		System.out.println("삐뽀삐뽀");
	}
	
	
//  main
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.run();
		
		Car c2 = new Car("자동차", 100);
		c2.run();
		
		Amblance a1 = new Amblance(true);
		a1.run();
		a1.siren();
		
		Amblance a2 = new Amblance();
		a2.run();
		a2.siren();
	}
}
