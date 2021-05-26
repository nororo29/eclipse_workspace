package java_basic_day6;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// 숫자 n 입력받아 1~n까지 소수 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();
		
		
		if (n < 2) {
			sc.close();
			return;
		}
		if (n == 2) {
			System.out.print(n);
			sc.close();
			return;
		}
		
		System.out.print("2 3 ");
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			
			if (i % 2 == 0 || i % 3 == 0) {
				isPrime = false;
				continue;
			}
			
			for (int j = 5; j <= i / j; j+=2) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true)
				System.out.print(i + " ");
		}
		

		sc.close();
	}

}
