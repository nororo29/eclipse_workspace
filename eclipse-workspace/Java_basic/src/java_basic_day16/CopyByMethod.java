package java_basic_day16;

class Student {
	String name;
	int id;
}

public class CopyByMethod {

	public static void main(String[] args) {

		CopyByMethod test = new CopyByMethod();
		
		// value
		int num = 10;
		boolean b = true;
		
		test.copybyvalue(num, b); // 10,true -> 100,false
		System.out.println(num + " " + b); // 10, true -> 값 바뀌지 않음

		
		// Reference
		Student s1 = new Student();
		
		test.copyByReference(s1);  // s1의 주소 전달
		System.out.println(s1.name + " " + s1.id); // abc, 1 -> 값 변함
		
		Student s2 = new Student();
		System.out.println("s1주소: " + s1);
		System.out.println("s2주소: " + s2);
		
		s2 = s1;  // 주소값 복사
		System.out.println("s1주소: " + s1);
		System.out.println("s2주소: " + s2);
		
	}

	public void copybyvalue(int i, boolean b) {  // Value는 지역변수 -> {}안에서만 사용되고 사라짐
		i = 100;
		b = false;
		
		System.out.println("메서드 안 : " + i + " " + b);
	}

	public void copyByReference(Student s) {  // Object는 주소를 전달
		s.name = "abc";
		s.id = 1;
		
		System.out.println("메서드 안 : " + s.name + " " + s.id);
	}

}
