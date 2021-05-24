package java_basic_day7;

public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };

		for (int i : arr)
			System.out.println(i);

		// 학색 이름, 학번, 위치 정보 100개
		String[] info = new String[100];

		info[0] = "홍길동, 1020, 구로구";
		info[1] = "홍길, 1021, 구로";

		for (int i = 0; i < info.length; i++) {
			String person = info[i];
			if (person == null)
				break;
			String[] data = person.split(", ");
			System.out.println("이름 : " + data[0]);
			System.out.println("학번 : " + data[1]);
			System.out.println("위치 : " + data[2]);
		}

		for (String str : info) {
			if (str == null)
				break;
			System.out.println(str);
		}

		// 배열 : 정적... null에러...
		// ArrayList : 동적(할당받는시간필요 - 시간많이걸림)

		String[] name = new String[100];
		String[] number = new String[100];
		String[] house = new String[100];

		name[0] = "홍길동";
		number[0] = "1020";
		house[0] = "구로구";
		// name[1] = "홍길동1"; number[1] = "1021";
		// 빠지는 데이터가 있을 때,,

		// 배열 : null에러... -> 기본데이터로 다 채워주는 방법
//		String[] info2 = new String[] { "", "" };
		// String[] info2 = {"", ""};
	}

}
