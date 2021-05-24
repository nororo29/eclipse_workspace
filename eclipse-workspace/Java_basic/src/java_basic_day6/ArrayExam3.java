package java_basic_day6;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		// 100개의 정수 배열 선언 후, 정수 차례로 입력받다가 -1 입력되면 입력 중단하고
		// -1을 제외한 마지막 3개의 정수 출력
		// 입력받은 정수가 -1을 제외하고 3개 미만일 경우 -1을 제외하고 입력받은 정수 모두 출력
		Scanner sc = new Scanner(System.in);

		int[] numArr = new int[100];
		int len = 0;

		for (int i = 0; i < 100; i++) {
			int n = sc.nextInt();
			if (n == -1)
				break;

			numArr[i] = n;
			len++;
		}

		if (len == 0) {
			System.out.println("입력받은 정수가 없습니다.");
		} else if (len < 3) {
			for (int i = 0; i < len; i++) {
				System.out.print(numArr[i] + " ");
			}
		} else {
			for (int i = len - 3; i < len; i++) {
				System.out.println(numArr[i] + " ");
			}
		}

		sc.close();

	}

}
