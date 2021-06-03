package java_basic_day15;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = new int[] {0,1,2,3,4,5};
		int[] nums2 = new int[10];
		
		System.arraycopy(nums1, 0, nums2, 0, nums1.length);
		for (int i : nums2)
			System.out.print(i + " ");
		
		nums1[3] = 100;
		
		System.out.println();
		for (int i : nums2)
			System.out.print(i + " ");
		
		nums2[3] = 100;
		
		System.out.println();
		for (int i : nums2)
			System.out.print(i + " ");
		
		System.out.println();
		
		nums2 = nums1;
		for (int s : nums2) {
			System.out.print(s + " ");	
		}
		
		System.out.println();
		System.out.println(nums1);
		System.out.println(nums2);

		System.out.println();
		String[] strs1 = {"a", "b", "c"};
		String[] strs2 = new String[5];
		
		System.arraycopy(strs1, 0, strs2, 0, strs1.length);
		
		for (String s : strs2) {
			System.out.print(s + " ");	
		}
		
		strs1[1] = "abcdef";
		
		System.out.println();
		for (String s : strs2) {
			System.out.print(s + " ");	
		}
		
		System.out.println();
		
		strs2 = strs1;
		for (String s : strs2) {
			System.out.print(s + " ");	
		}
		
		System.out.println();
		System.out.println(strs1);
		System.out.println(strs2);
	}

}
