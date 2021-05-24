package java_basic_day6.homework;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// 자연수 n입력받고 1부터 홀수를 차례대로 더해 합이 n 이상이면 더해진 홀수의 개수와 그 합 출력
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int oddNum = 0;
		int oddSum = 0;

		for (int i = 1; i <= n; i += 2) {
			oddSum += i;
			oddNum++;
			if (oddSum >= n) {
				System.out.println("더해진 홀수 개수 : " + oddNum);
				System.out.println("더해진 홀수 합 : " + oddSum);
				break;
			}
		}

		sc.close();
	}

}
