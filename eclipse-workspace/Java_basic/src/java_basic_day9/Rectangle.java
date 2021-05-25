package java_basic_day9;

public class Rectangle {
	
	String name;
	int row;
	int col;
	
	public Rectangle() {}
	
	public Rectangle(String n) {
		name = n;
	}
	
	public Rectangle(int r, int c) {
		row = r;
		col = c;
	}
	
	public Rectangle(String n, int r, int c) {
		name = n;
		row = r;
		col = c;
	}
	
	public void printRec() {
		System.out.println(name + " : " + row + "x" + col);
	}
	
	public int getArea() {
		return row * col;
	}
	

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle("abc");
		Rectangle r3 = new Rectangle(9, 8);
		Rectangle r4 = new Rectangle("abc123", 10, 5);
		
		r1.printRec();
		r2.printRec();
		r3.printRec();
		r4.printRec();
		
		System.out.println(r4.getArea());
		
	}

}
