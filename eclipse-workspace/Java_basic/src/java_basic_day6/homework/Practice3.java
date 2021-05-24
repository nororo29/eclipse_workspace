package java_basic_day6.homework;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// 자연수 n입력받아 n*n크기에 공백으로 구분하여 출력
		// 10미만의 홀수만 출력
		// 숫자는 공백으로 구분 , 줄 사이에 빈줄은 없음
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] oddArr = { 1, 3, 5, 7, 9 };
		int[][] odd2Arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				odd2Arr[i][j] = oddArr[(n * i + j) % 5];
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(odd2Arr[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
