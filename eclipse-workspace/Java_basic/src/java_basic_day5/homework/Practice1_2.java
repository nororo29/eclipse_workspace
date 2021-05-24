package java_basic_day5.homework;

public class Practice1_2 {

	public static void main(String[] args) {
		// 구구단 출력
		int dan;
		int i;

		for (dan = 2; dan <= 9; dan++) {
			if (dan % 2 != 0)
				continue;
			for (i = 1; i <= 9; i++) {
				System.out.println(dan + "X" + i + "=" + (dan * i));
			}
			System.out.println();
		}
	}

}
