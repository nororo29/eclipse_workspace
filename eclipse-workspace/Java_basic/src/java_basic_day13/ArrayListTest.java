package java_basic_day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Book {
	String name;
	
	public Book() {}
	
	public Book(String name) {
		this.name = name;
	}
}

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("a"));
		library.add(new Book("b"));
		library.add(new Book("c"));

		System.out.println(library.size());
		
		library.remove(0);
		library.add(0, new Book("abc"));
		
		System.out.println(library.size());
		
		for (Book b : library) {
			System.out.println(b.name);
		}
		
		System.out.println(library.get(0).name);
		
		
		// List...
		List<String> list = Arrays.asList("a", "b", "c");
//		List<Member> list1 = Arrays.asList(new Member(1, "a"), new Member(2, "b"));
		
		for (String s : list) {
			System.out.println(s);
		}
		
		// Iterator
		Iterator<String> s = list.iterator();
		while (s.hasNext())
			System.out.println(s.next());
		
	}

}
