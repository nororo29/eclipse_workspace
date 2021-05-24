package java_basic_day6;

import java.util.Scanner;

public class MathPowExam {

	public static void main(String[] args) {
		// 2N ^ (2N - 1) 합들... 2^1 + 4^3 + 6^5...
		Scanner sc = new Scanner(System.in);

		System.out.print("N의 값을 입력하세요 : ");
		int n = sc.nextInt();
		System.out.println("N의 값 : " + n);

		double total = 0;

		for (int i = 1; i <= n / 2; i++) {
			total += Math.pow(2 * i, 2 * i - 1);
		}
		System.out.println("합계 : " + total);

		sc.close();
	}

}
