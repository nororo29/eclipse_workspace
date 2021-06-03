package java_basic_day16;

/* 비행기 날아 갈 수 있음
 * 초음속 비행기 모드가 초음속이면 초음속으로 날기
 * 모드가 일반이면 일반 비행기 속도로 난다
 */

class Airplane {
	public void land() {
		System.out.println("착륙합니다.");
	}
	
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
	
	public void fly() {
		System.out.println("일반 속도로 납니다.");
	}
}

class Supersonic extends Airplane {
	public final static int NORMAL = 0;
	public final static int SUPERSONIC = 1;
	
	private int mode = NORMAL;
	
	public void setMode(int i) {
		this.mode = i;
	}
		
	@Override
	public void fly() {
		if (mode == SUPERSONIC)
			System.out.println("초고속모드입니다.");
		else
			super.fly();
	}
	
}

public class AirplaneEx {

	public static void main(String[] args) {

		// 상위클래스 선언, 생성 -> 상위클래스 메소드만
		Airplane a2 = new Airplane();
		
		a2.takeOff();
		a2.fly();
		a2.land();
		
		// 하위클래스 선언, 생성 -> 상위클래스 메소드 & 하위클래스 메소드
		Supersonic a1 = new Supersonic();
		
		a1.takeOff();
		a1.fly();
		a1.setMode(1);
		a1.fly();
		a1.setMode(0);
		a1.fly();
		a1.land();
		
		// 상위클래스 선언, 하위클래스 생성(업캐스팅-묵시적) -> 상위클래스 메소드, 오버라이딩된 하위클래스 메소드
		Airplane a3 = new Supersonic();
		
		a3.takeOff();
		a3.fly();  // 오버라이딩된 메소드
//		a3.setMode(1);  //안됨
		a3.land();
		
		// 하위클래스로 다운캐스팅(명시적)
		Supersonic a4 = (Supersonic) a3; 
		
		a4.takeOff();
		a4.fly();
		a4.setMode(1);
		a4.fly();
		a4.land();
		
	}

}
