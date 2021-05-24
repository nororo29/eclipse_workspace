package java_basic_day5.homework;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// 피연산자 연산자 피연산자 입력받은 후 계산
		Scanner sc = new Scanner(System.in);

		int result = 0;

		System.out.print("피연산자:");
		int num1 = sc.nextInt();
		System.out.print("연산자:");
		String operator = sc.next();
		System.out.print("피연산자:");
		int num2 = sc.nextInt();

		switch (operator) {
		case "+": {
			result = num1 + num2;
			break;
		}
		case "-": {
			result = num1 - num2;
			break;
		}
		case "*": {
			result = num1 * num2;
			break;
		}
		case "/": {
			result = num1 / num2;
			break;
		}
		default:
			System.out.println("연산자 오류");
			break;
		}

		System.out.println("결과:" + result);
		sc.close();
	}

}
