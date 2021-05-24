package java_basic_day6;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		// 정수 배열을 ","구분자로 입력 받기 -> 가장 큰 수 출력
		// 정수 배열 입력 받기 -> while문을 이용해 짝수번째 요소 합과 평균 출력
		Scanner sc = new Scanner(System.in);

		int numArr[] = new int[10];

		String numStr = sc.nextLine();

		for (int i = 0; i < 10; i++) {
			numArr[i] = Integer.parseInt(numStr.split(", ")[i]);
		}

		// 최댓값 구하기
		int maxNum = numArr[0];

		for (int i = 0; i < 10; i++) {
			if (maxNum < numArr[i])
				maxNum = numArr[i];
		}

		System.out.println(maxNum);

		// 짝수요소 합, 평균
		int sum = 0;
		int avg = 0;

		int i = -1;
		while (++i < 10) {
			if (i % 2 == 1)
				continue;
			sum += numArr[i];
		}
		avg = sum / 5;

		System.out.println("짝수요소 합 : " + sum + " 평균 : " + avg);
		sc.close();
		// 버블정렬

	}

}