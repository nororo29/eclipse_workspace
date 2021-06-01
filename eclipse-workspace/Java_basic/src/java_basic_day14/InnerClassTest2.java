package java_basic_day14;

public class InnerClassTest2 {

	public void retrieve(String table) {
		// Db table에서 data row fetch.(가져오다)
		// data row : 책 제목, 저자, 청구번호 -> 객체화해서(Inner class사용)
		class Book { // retreive() 메소드에서만 쓰는 클래스
			String title;
			String author;
			String id;

			public Book(String title, String author, String id) {
				this.title = title;
				this.author = author;
				this.id = id;
			}

		}

//		String[] result = Db.fetch(table);  // data row...
		String[] result = { "java", "lucy", "a1000" }; // data row...

		Book book = new Book(result[0], result[1], result[2]);

		if (book.title.contains("j")) {
			// ...
		}

	}

	public static void main(String[] args) {
		int a = Integer.MAX_VALUE + 2;
		System.out.println(a);
	}

}
