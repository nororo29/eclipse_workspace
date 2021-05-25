package java_basic_day9.info;

public class Person {
	public int age;
	public String name;
	public String gender;
	public boolean married;
	public int childNum;
	
	public void printPerson() {
		System.out.println("나이 : " + age);
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("결혼여부 : " + married);
		System.out.println("자녀 수 : " + childNum);
	}
	
}
