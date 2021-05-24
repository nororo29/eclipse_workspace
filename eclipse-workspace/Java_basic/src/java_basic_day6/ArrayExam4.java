package java_basic_day6;

import java.util.Scanner;

public class ArrayExam4 {

	public static void main(String[] args) {
		// 6개의 문자배열 만들고 {'P', 'R', 'O', 'G', 'R', 'A', 'M','M','I','N','G'}으로 초기화한 후
		// 문자 한개를 입력받아 배열에서의 위치 출력
		// 첫 번째 위치는 0
		// 배열에 없는 문자 입력받으면 "none" 출력
		Scanner sc = new Scanner(System.in);

		char[] charArr = { 'P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'I', 'N', 'G' };
		int len = charArr.length;
		char ch = sc.next().charAt(0);

		int i;
		for (i = 0; i < len; i++) {
			if (ch == charArr[i]) {
				System.out.println(i);
				sc.close();
				break;
			}
		}

		if (i == len)
			System.out.println("none");

//		sc.close();
	}

}
