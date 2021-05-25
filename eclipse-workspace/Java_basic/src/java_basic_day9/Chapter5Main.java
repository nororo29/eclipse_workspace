package java_basic_day9;

import java_basic_day9.info.Person;

// import 하면 패키지명안쓰고 그냥 Student로 사용가능
// 같은 이름의 클래스가 있으면 충돌 일어남
//import java_basic_day8.Student;

public class Chapter5Main {

	public static void main(String[] args) {
		Student st = new Student();

		// 하위 패키지 - import사용
		Person p1 = new Person();

		st.studentId = 1000;
		st.studentName = "홍길동";
		st.setAddress("구로구");
		System.out.println(st.showStudentInfo());
		String info = st.setScore(100);
		System.out.println(info);

		// 다른 패키지 - 패키지명.클래스명
		java_basic_day8.Student st2 = new java_basic_day8.Student();

	}

}
