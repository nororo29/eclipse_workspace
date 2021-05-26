package java_basic_day10;

public class Prime {
	
	int number;
	
	// 생성자
	public Prime() {}
	
	public Prime(int t) {
		number = t;
	}
	
	// setter
	public void setNumber(int t) {
		number = t;
	}
	
	// 메소드
	public void primeNumber() {
		if (number < 2) {
			return;
		}
		if (number == 2) {
			System.out.print(number);
			return;
		}
		
		System.out.print("2 3 ");
		for (int i = 2; i <= number; i++) {
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
	}
	
	public void print() {
		System.out.printf("0부터 %d까지 소수는 [", number);
		primeNumber();
		System.out.println("] 이다.");
	}
	
	
	
//  main
	public static void main(String[] args) {
		Prime p1 = new Prime(50);
		p1.print();
	}
	
}
