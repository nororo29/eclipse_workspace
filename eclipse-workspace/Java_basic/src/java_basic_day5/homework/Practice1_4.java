package java_basic_day5.homework;

public class Practice1_4 {

	public static void main(String[] args) {
		// 별...삼각형
		int lineNum = 7;
		int middleNum = lineNum / 2;

		int num = middleNum;
		while (num >= 0) {
			for (int i = 0; i < num; i++)
				System.out.print(" ");
			for (int i = 0; i < (2 * (middleNum - num + 1) - 1); i++)
				System.out.print("*");
			for (int i = 0; i < num; i++)
				System.out.print(" ");

			System.out.println();
			num--;
		}
	}

}
