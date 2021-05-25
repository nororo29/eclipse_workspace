package java_basic_day9;

import java_basic_day9.info.Person;

public class PersonExam {

	public static void main(String[] args) {
		// 나이 40, 이름 "james", 결혼 O, 자식 3
		Person m1 = new Person();
		Person m2 = new Person();
		
		m1.age = 40;
		m1.name = "James";
		m1.gender = "남자";
		m1.married = true;
		m1.childNum = 3;
		
		//m2.name = "카라";
		//m2.age = 41;
		m2.childNum = 0;
		m2.gender = "여자";
		
		m1.printPerson();
		m2.printPerson(); //null에러안남...
	}

}
