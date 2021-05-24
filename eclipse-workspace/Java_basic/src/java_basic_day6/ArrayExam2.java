package java_basic_day6;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 10개 문자 입력받아 마지막으로 입력 받은 문자부터 ..역순으로 출력
		Scanner sc = new Scanner(System.in);

		String[] strArr = new String[10];

		for (int i = 0; i < 10; i++)
			strArr[i] = sc.next();

		for (int j = 9; j >= 0; j--)
			System.out.print(strArr[j] + " ");

		sc.close();
	}

}
