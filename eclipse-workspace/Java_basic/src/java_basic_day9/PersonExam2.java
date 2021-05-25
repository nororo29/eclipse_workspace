package java_basic_day9;

public class PersonExam2 {

	String name;
	float height;
	float weight;
	
	public PersonExam2() {
		System.out.println("Person 생성자 생성");
	}
	
	public PersonExam2(String n, float w, float h) {
		name = n;
		weight = w;
		height = h;
		
		System.out.println(name + " " + weight + " " + height);
	}
	
	
	
	public static void main(String[] args) {

		PersonExam2 p1 = new PersonExam2();
		PersonExam2 p2 = new PersonExam2("gina", 180, 80);
		
	}

}
