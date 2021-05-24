package java_basic_day5.homework;

public class Practice1_3 {

	public static void main(String[] args) {
		// 구구단 변형...
		int dan;
		int i;

		for (dan = 2; dan <= 9; dan++) {
			for (i = 1; i <= 9; i++) {
				if (i > dan)
					break;
				System.out.println(dan + "X" + i + "=" + (dan * i));
			}
			System.out.println();
		}
	}

}
