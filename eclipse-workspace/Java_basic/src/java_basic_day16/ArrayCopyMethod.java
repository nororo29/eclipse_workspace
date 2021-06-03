package java_basic_day16;

class System2 {
	
	public static void arraycopy(String[] src,int srcPos, String[] dst, int dstPos, int length ) {
		for (int i = srcPos; i < srcPos + length; i++) {
			dst[dstPos++] = src[i];
		}
	}
	
	public static void arraycopy(int[] src,int srcPos, int[] dst, int dstPos, int length ) {
		for (int i = srcPos; i < srcPos + length; i++) {
			dst[dstPos++] = src[i];
		}
	}
}

public class ArrayCopyMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System2 system2 = new System2();
		
		String[] s1 = {"a", "b", "c"};
		String[] s2 = new String[5];
		
		System2.arraycopy(s1, 0, s2, 0, s1.length);
		
		for (String s : s2)
			System.out.print(s + " ");
		
		System.out.println();
		
		int[] i1 = {1,2,3,4,5};
		int[] i2 = new int[10];
		
		System2.arraycopy(i1, 0, i2, 2, i1.length);
		
		for (int i : i2)
			System.out.print(i + " ");
		
		
		
	}

}
