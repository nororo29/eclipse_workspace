package java_basic_day13;

public class ArrayTest2 {

	public static void main(String[] args) {

		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		
		//System.arraycopy(array1, 1, array2, 0, 5); //ArrayIndexOutOfBoundsException
		
		try {
			System.arraycopy(array1, 1, array2, 0, 5);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
		
		//전체 복사
		System.arraycopy(array1, 0, array2, 0, array1.length);
		
		for (int i : array2) {
			System.out.println(i);
		}
		
	}

}
