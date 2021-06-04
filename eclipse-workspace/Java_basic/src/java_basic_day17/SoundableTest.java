package java_basic_day17;

interface Soundable {
	String sound();
}

class Dog implements Soundable {

	@Override
	public String sound() {
		return "멍멍";
	}
	
	public void who() {
		System.out.println("개");
	}
}

class Cat implements Soundable{

	@Override
	public String sound() {
		return "냐옹";
	}
	
	public void who() {
		System.out.println("고양이");
	}
	
}

public class SoundableTest {

	public static void main(String[] args) {

		Soundable a1 = new Dog();
		Soundable a2 = new Cat();
		
		System.out.println(a1.sound());
		System.out.println(a2.sound());
		
		
		// doSound(Soundable s) 
		doSound(new Dog());
		doSound(new Cat());
		
		// a1.who();  // a2.who(); -> 하위클래스 메소드
		((Dog)a1).who();
		((Cat)a2).who();
		
		
	}
	
	static void doSound(Soundable s) {
		System.out.println(s.sound());
	}

}
