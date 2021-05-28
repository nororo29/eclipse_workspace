package java_basic_day12;

public class WrapperClassTest {

	public static void main(String[] args) {

		Integer ival = new Integer(100);

		// int/String -> Integer 오토박싱/박싱
		ival = Integer.valueOf(100);
		ival = Integer.valueOf("1000");
		ival = 3;

		// Integer(객체) -> int 언박싱
		int i = ival.intValue();
		i = ival + 3;
		i = ival;

		// String(객체) -> int 언박싱
		i = Integer.parseInt("100");

		Byte bt = Byte.valueOf("11");
		byte b = Byte.parseByte("10");

		Float ft = Float.valueOf("2.4F");

		/// 비교연산
		Integer i1 = Integer.valueOf("1000");
		Integer i2 = Integer.valueOf("1000");

		if (i1.equals(i2)) // equals() 오버라이딩... 값 비교
			System.out.println("i1.equals(i2) : true");
		if (i1 == i2) // 주소값 비교
			System.out.println("i1 == i2 : true");

	}

}
