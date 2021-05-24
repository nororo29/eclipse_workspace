package java_basic_day6.homework;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 자연수 n입력받아 모래시계 출력
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int spaceNum = 0;
		int starNum = 2 * n - 1;

		for (int i = 0; i < (2 * n - 1); i++) {
			for (int j = 0; j < spaceNum; j++)
				System.out.print(" ");
			for (int z = 0; z < starNum; z++)
				System.out.print("*");

			if (i >= n - 1) {
				spaceNum--;
				starNum += 2;
			} else {
				spaceNum++;
				starNum -= 2;
			}

			System.out.println();
		}

		sc.close();
	}

}
