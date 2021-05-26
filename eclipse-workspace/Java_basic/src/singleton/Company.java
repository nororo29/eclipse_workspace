package singleton;

// 싱글톤 패턴으로 회사 클래스 구현하기

public class Company {

	// 유일한 인스턴스 - Company클래스 내부에서 하나의 인스턴스 생성
	// private로 외부에서 이 인스턴스에 접근하지 못하도록 제한
//	private static Company instance = new Company();
//	private static Company instance = null;
	private static Company instance;
//	- 미리 생성하지 않는다
	

	// 생성자 private로 지정
	// - 디폴트 생성자 자동으로 만들어지지 않고, Company클래스 내부에서만 이 클래스의 생성을 제어할 수 있다.
	private Company() {
		System.out.println("Create Instance");
	}

	// private로 선언한 인스턴스 반환하는 public메소드
	// static메소드 - 인스턴스 생성과 상관없이 호출해야함
	// 유일하게 instance에 접근할 수 있는 방법
	public static Company getInstance() {
		// 최초로 사용할 때 인스턴스 생성
		if (instance == null) {
			instance = new Company();
		}
		return instance;
	}

	
	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance();  
		// 최초로 인스턴스 생성 - "Create Instance"출력
		Company myCompany2 = Company.getInstance();  
		// 인스턴스 생성안됨 반환만 함
		
		System.out.println(myCompany1 == myCompany2);
		// true 출력
	}
}
