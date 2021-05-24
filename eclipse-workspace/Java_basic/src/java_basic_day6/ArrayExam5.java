package java_basic_day6;

import java.util.Scanner;

public class ArrayExam5 {

	public static void main(String[] args) {
		// 1반부터 6반까지 평균점수 저장 후 두 반의 번호 입력받아
		// 두 반 평균점수의 합을 출력
		// 반별 평균점수 초기값 : 85.6, 79.5, 83.1, 80.0, 78.2, 75.0
		// 출력은 소수 두 번째 자리에서 반올림하여 소수 첫째자리까지
		Scanner sc = new Scanner(System.in);

		double[] classAvg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };

		int class1 = sc.nextInt();
		int class2 = sc.nextInt();

		System.out.println(classAvg[class1 - 1] + classAvg[class2 - 1]);

		sc.close();
	}

}
