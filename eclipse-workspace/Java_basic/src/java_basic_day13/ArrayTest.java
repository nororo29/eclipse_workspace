package java_basic_day13;

public class ArrayTest {

	public static void main(String[] args) {

		double[] data = new double[5];
		
		// 초기화
		for (int i = 0; i < data.length; i++) {
			data[i] = -1.0;
		}
		
		// 인덱스를 활용해서 현재 사용하는 배열만 사용한다.
		int index = 0;
		data[0] = 10.0; index++;
		data[1] = 11.0; index++;
		data[2] = 5.0; index++;
		// 삭제
		data[2] = -1.0; index--;
		
		/* 이렇게 쓰지말고....
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		*/
		
		for (int i = 0; i < index; i++) {
			System.out.println(data[i]);
		}
		
		
		
		
		
	}

}
