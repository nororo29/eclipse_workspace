package java_basic_day10;

public class Person {  // public클래스 - 다른 패키지 사용가능  // 그냥(default)클래스 - 다른 패키지 사용안됨
	
	// private - 다 차단
	private int age;
	private String gender;
	
	// default - 동일패키지
	String name;
	
	// protected - 동일패키지, 자식클래스 허용
	protected String blood;
	
	// public - 모든 클래스 허용
	public String job;

	
	
	// getter setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	// 생성자
	public Person() {
		this("이름없음", -1, "", "", "직업없음");
	}

	public Person(String name, int age) {
		this(name, age, "", "", "직업없음");
	}

	public Person(String name, int age, String gender, String blood, String job) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		this.job = job;
	}

	
	
	// method
	public void play() {
		switch (job) {
		case "의사": {
			System.out.println("진료한다");
			break;
		}
		case "골퍼": {
			System.out.println("라운딩 갔다");
			break;
		}
		case "교수": {
			System.out.println("강의한다");
			break;
		}
		default:
			System.out.println("job오류");
			break;
		}
	}

	
//  main
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.print(p1.name + " " + p1.age + " ");
		p1.play();

		Person p2 = new Person("홍길동", 20);
		System.out.print(p2.name + " " + p2.age + " ");
		p2.play();

		Person p3 = new Person("나나나", 30, "여", "A", "의사");
		System.out.print(p3.name + " " + p3.age + " ");
		p3.play();

	}
}
