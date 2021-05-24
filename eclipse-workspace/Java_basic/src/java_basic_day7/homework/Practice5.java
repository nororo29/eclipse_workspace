package java_basic_day7.homework;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// 10개의 정수 입력받아 배열에 저장 후 내립차순으로 정렬
		Scanner sc = new Scanner(System.in);

		int[] intArr = new int[10];
		int temp;

		for (int i = 0; i < 10; i++) {
			intArr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 9 - i; j++) {
				if (intArr[j] < intArr[j + 1]) {
					temp = intArr[j];
					intArr[j] = intArr[j + 1];
					intArr[j + 1] = temp;
				}
			}
		}

		for (int i : intArr)
			System.out.print(i + " ");

		sc.close();
	}

}