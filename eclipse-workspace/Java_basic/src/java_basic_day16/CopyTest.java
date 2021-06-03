package java_basic_day16;

class Student2 implements Cloneable{
	String name;
	int id;
	
	public Student2() {}

	public Student2(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class CopyTest {

	public static void main(String[] args) {

		// 얕은복사 (주소값 복사)
		
		// 배열
		int[] intArr1 = {1,2,3,4,5};
		int[] intArr2 = new int[5];
		
		intArr2 = intArr1;
		
		System.out.println(intArr1);  // [I@41a4555e
		System.out.println(intArr2);  // [I@41a4555e
		
		intArr1[3] = 99;
		for (int i : intArr2) {
			System.out.println(i);
		}
		
		// 객체
		Student2 s1 = new Student2("lucy", 1);
		Student2 s2 = new Student2();
		
		s2 = s1;
		
		System.out.println(s1 + " " + s1.name + s1.id); // java_basic_day16.Student2@39ed3c8d lucy1
		System.out.println(s2 + " " + s2.name + s2.id); // java_basic_day16.Student2@39ed3c8d lucy1
		
		// 객체배열
		Student2[] sArr1 = {new Student2("lucy", 1), new Student2("gina", 2), new Student2("tom", 3)};
		Student2[] sArr2 = new Student2[3];
		
		sArr2 = sArr1;
		System.out.println(sArr1 + " " + sArr1[0].name); // java_basic_day16.Student2@39ed3c8d lucy1
		System.out.println(sArr2 + " " + sArr2[0].name); // java_basic_day16.Student2@39ed3c8d lucy1
		
		sArr1[0].name = "ddd";
		System.out.println(sArr1 + " " + sArr1[0].name);
		System.out.println(sArr2 + " " + sArr2[0].name);
		
		
		// arraycopy() 객체배열 -> 객체배열의 주소는 다르지만,,,,객체의 주소는 같음,,, (얕은복사)
		System.arraycopy(sArr1, 0, sArr2, 0, 3);
		
		// 객체배열의 주소는 다름
		System.out.println(sArr1);  // [Ljava_basic_day16.Student2;@71dac704
		System.out.println(sArr2);  // [Ljava_basic_day16.Student2;@123772c4
		// 객체배열 속 객체의 주소는 같음 -> 결론 얕은복사
		System.out.println(sArr1[0] + " " + sArr1[0].name);  // java_basic_day16.Student2@2d363fb3 lucy
		System.out.println(sArr2[0] + " " + sArr2[0].name);  // java_basic_day16.Student2@2d363fb3 lucy
		// 값 바꾸면 같이 변경됨
		sArr1[0].name = "ddd";
		System.out.println(sArr1[0].name); // ddd
		System.out.println(sArr2[0].name); // ddd
		
		
	}

}
