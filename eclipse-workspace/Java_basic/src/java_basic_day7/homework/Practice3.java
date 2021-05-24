package java_basic_day7.homework;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 자연수 n입력받아 숫자 삼각형 출력
		// 숫자사이 공백으로 구분
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int printNum = 1;

			for (int z = n - 1 - i; z > 0; z--) {
				System.out.print("  ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print(printNum + " ");
				printNum++;
			}

			System.out.println();
		}

		sc.close();

	}

}
