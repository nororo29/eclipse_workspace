package java_basic_day13;

public class TryCatchTest {

	public static void main(String[] args) {

		String[] testArray;

		testArray = new String[10]; // 초기화

		System.out.println(testArray[0]);
//		System.out.println(testArray[0].concat("abc"));  // NullPointerException  null값뒤에 concat X

		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = ""; // 초기화 -> NullPointer오류안남
		}

		for (int i = 0; i < testArray.length; i++) {
			try {
				System.out.println(testArray[i].concat("abc"));

			} catch (NullPointerException e) {
				System.out.println(e);
				System.out.println(e.getMessage());

			} finally {
//				testArray[0] = "";
				System.out.println("예외처리 후 항상 할 일");
			}
		}
		

		/* 예외처리
		 * 1.========================================
		 * 
		 * try {
		 * 
		 * } catch (NullPointerException e) {
		 * 
		 * }
		 * 
		 * 2.========================================
		 * 
		 * try {
		 * 
		 * } finally { 
		 * 
		 * }
		 * 
		 * 3.========================================
		 * 
		 * try {
		 * 
		 * } catch (NullPointerException e) { 
		 * 
		 * } catch (NumberFormatException e) {
		 * 
		 * } finally {
		 * 
		 * }
		 * 
		 * 4.========================================
		 * 
		 * try {
		 * 
		 * } catch (NullPointerException | NumberFormatException e) { 
		 * 
		 * }
		 */
	}

}
