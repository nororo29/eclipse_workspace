package java_basic_day13;

import java.util.Scanner;

class Student {
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		Student students[] = new Student[5];
		
		while (true) {
			System.out.println("학생 성적 : (이름/학년/주소/수학/과학/영어)");
			String result = sc.nextLine();

			// index가 배열 크기 넘으면 0번 인덱스부터 다시
			if (index == students.length) {
				index = 0;
			}
			
			//종료
			if (result.contains("q")) {
				System.out.println("close..");
				print(students);
				break;
			}
			
			students[index] = new Student(result);
			index++;
		}
		
		sc.close();
		
	}
	
	static void print(Student[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].name);
		}
	}

}
