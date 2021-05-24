package java_basic_day7.homework;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 100개 정수 저장할 배열 선언 후 정수 입력받음
		// 0 입력되면 0을 제외하고 그 때까지 입력된 정수 역으로 출력
		Scanner sc = new Scanner(System.in);

		int[] intArr = new int[100];
		int len = 0;

		for (int i = 0; i < 100; i++) {
			int n = sc.nextInt();

			if (n == 0)
				break;

			intArr[i] = n;
			len++;
		}

		for (int i = len - 1; i >= 0; i--) {
			System.out.print(intArr[i] + " ");
		}

		sc.close();
	}

}
