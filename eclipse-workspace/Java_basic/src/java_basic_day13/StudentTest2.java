package java_basic_day13;

import java.util.HashSet;

class Student2 {
	String id;
	String name;
	
	public Student2(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student2) {
			Student2 std = (Student2)obj;
			if (this.id == std.id)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return this.id + ":" + this.name;
	}
	
}

public class StudentTest2 {

	public static void main(String[] args) {

		HashSet<Student2> set = new HashSet<Student2>();
		
		set.add(new Student2("100", "홍길동"));
		set.add(new Student2("200", "강감찬"));
		set.add(new Student2("300", "이순신"));
		set.add(new Student2("400", "정약용"));
		set.add(new Student2("100", "송중기"));
		
		System.out.println(set);
	}

}
