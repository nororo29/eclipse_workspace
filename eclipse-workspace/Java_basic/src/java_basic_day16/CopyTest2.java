package java_basic_day16;

public class CopyTest2 {

	public static void main(String[] args) {
		// 깊은복사 (내용값 복사)

		// 배열 - arraycopy : 주소값 다름, 내용값만 같음
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		int[] intArr2 = new int[5];

		System.arraycopy(intArr1, 0, intArr2, 0, 5);

		System.out.print(intArr1 + " "); // [I@41a4555e
		for (int i : intArr1)
			System.out.print(i + " ");  // 1 2 3 4 5
		System.out.println();
		System.out.print(intArr2 + " "); // [I@3830f1c0
		for (int i : intArr2)
			System.out.print(i + " ");  // 1 2 3 4 5
		System.out.println();

		// 객체 - clone : 주소값 다름, 객체 변수값 내용같음
		Student2 s1 = new Student2("lucy", 1);
		Student2 s2 = new Student2();

		try {
			s2 = (Student2) s1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(s1 + " " + s1.name + s1.id); // java_basic_day16.Student2@71dac704 lucy1
		System.out.println(s2 + " " + s2.name + s2.id); // java_basic_day16.Student2@123772c4 lucy1

		// 객체배열 -> 하나하나 넣어주기... 주소값다르고 내용만 같음
		Student2[] sArr1 = { new Student2("lucy", 1), new Student2("gina", 2), new Student2("tom", 3) };
		Student2[] sArr2 = new Student2[3];

		for (int i = 0; i < 3; i++) {
			sArr2[i] = new Student2();
			try {
				sArr2[i] = (Student2) sArr1[i].clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(sArr1 + " " + sArr1[0] + " " + sArr1[0].name);
		// [Ljava_basic_day16.Student2;@2d363fb3 java_basic_day16.Student2@7d6f77cc lucy
		System.out.println(sArr2 + " " + sArr2[0] + " " + sArr2[0].name);
		// [Ljava_basic_day16.Student2;@5aaa6d82 java_basic_day16.Student2@73a28541 lucy

	}

}
