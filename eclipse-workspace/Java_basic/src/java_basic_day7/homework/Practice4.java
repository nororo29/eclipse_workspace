package java_basic_day7.homework;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// 100미만의 양의 정수들 입력받기
		// 0입력되면 마지막에 입력된 0 제외하고 입력된 정수의 십의 자리 숫자 각 몇개인지 작은 수부터 출력
		Scanner sc = new Scanner(System.in);

		int[] tensDigit = new int[10];

		while (true) {
			int n = sc.nextInt();

			if (n == 0)
				break;
			if (n < 0 || n >= 100)
				continue;

			tensDigit[n / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			if (tensDigit[i] == 0)
				continue;
			System.out.println(i + " : " + tensDigit[i]);
		}

		sc.close();
	}

}
