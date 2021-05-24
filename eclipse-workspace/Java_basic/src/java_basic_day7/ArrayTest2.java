package java_basic_day7;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// 학생 과학/수학 시험 성적을 "학생/점수/점수" 순서로 10개 입력
		// 각 과목별 합계와 평균
		Scanner sc = new Scanner(System.in);

//		int[] sciArr = new int[10];
//		int[] mathArr = new int[10];
		String[] student = new String[10];

		int sciSum = 0;
		int mathSum = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("성적입력 : ");
			String str = sc.next();
			System.out.println((i + 1) + "/10");

			student[i] = str.split("/")[0];
			int sci = Integer.parseInt(str.split("/")[1]);
			int math = Integer.parseInt(str.split("/")[2]);

			sciSum += sci;
			mathSum += math;
		}

		for (int i = 0; i < student.length; i++) { // 이름이 ㅎ으로 시작.
			if (student[i].compareTo("하") >= 0)
				System.out.println(student[i]);
		}

		System.out.println("과학 : " + sciSum + " / " + (sciSum / 10));
		System.out.println("수학 : " + mathSum + " / " + (mathSum / 10));

		sc.close();
	}

}
