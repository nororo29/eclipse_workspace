package java_basic_day13;

class Box<T> {
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}

public class GenericBoxTest {

	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		Box<String> b2 = new Box<>();
		
		b1.set(123);
		b2.set("abc");
		
		System.out.println(b1.get());
		System.out.println(b2.get());
	}

}
