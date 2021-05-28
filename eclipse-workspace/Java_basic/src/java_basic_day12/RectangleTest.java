package java_basic_day12;

// 인터페이스 1
interface Drawable {

	int RED = 1;
	int GREEN = 2;
	int BLUE = 3;
	int BLACK = 4;
	int WHITE = 5;
	
	public abstract void draw(int color);
	
}

// 인터페이스 2
interface Sound {
	public abstract void sound(int tone);
}

// 1개의 인터페이스를 구현한 클래스
class Circle implements Drawable {
	int x1, x2, r;
	String[] colors = {"RED", "GREEN", "BLUE", "BLACK", "WHITE"};

	public Circle(int x1, int x2, int r) {
		this.x1 = x1;
		this.x2 = x2;
		this.r = r;
	}
	
	
	@Override
	public void draw(int color) {
		System.out.printf("center:(%d %d), color:%s \n",
				x1, x2, colors[color - 1]);
		// 드로잉 강도가 10d이면
//		sound(10);  
	}
}

// 2개의 인터페이스를 구현한 클래스
class Rectangle implements Drawable, Sound {
	
	int x1, x2, y1, y2;
	String[] colors = {"RED", "GREEN", "BLUE", "BLACK", "WHITE"};
	
	public Rectangle(int  x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public int getX1() { return x1; }
	public int getX2() { return x2; }
	public int getY1() { return y1; }
	public int getY2() { return y2; }

	@Override
	public void draw(int color) {  // implements Rectangle
		System.out.printf("left-top:(%d %d), right-bottom:(%d %d), color:%s ",
				x1, x2, y1, y2, colors[color - 1]);
		// 드로잉 강도가 10d이면
		sound(10);
	}

	@Override
	public void sound(int tone) {  // implements Sound
		System.out.println("사운드 매니져에서 출력 " + tone);
	}
	
}

public class RectangleTest {
	public static void main(String[] args) {
		
		Drawable[] drawables = new Drawable[] {  // 배열로 만들어서는 가능
				new Rectangle(10, 20, 15, 1),  // 안에 구현한 클래스로 생성...
				new Rectangle(1, 2, 3, 4),
				new Circle(0, 0, 3),
				new Circle(5, 2, 100)
		};
		
		for (Drawable d : drawables) {
			d.draw(Drawable.RED);
//			d.sound(1);    // 오류 - Sound는 다른 인터페이스
		}
		
//		Sound s1 = new Sound();  // 오류 - 인터페이스 생성은 안됨
		Sound s1 = new Rectangle(1, 2, 3, 4);
		s1.sound(1);
//		s1.draw();  // 오류 - Drawable은 다른 인터페이스
		
//		Drawable d1 = new Drawable();  // 오류 - 인터페이스 생성은 안됨
		Drawable d1 = new Rectangle(1, 2, 3, 4);
		d1.draw(Drawable.BLACK);
//		d1.sound();  // 오류
		
		Rectangle r1 = new Rectangle(1, 2, 3, 4);
		r1.draw(Drawable.BLUE);
		r1.sound(100);
		
		Circle c1 = new Circle(0, 0, 10);
		c1.draw(Drawable.WHITE);
//		c1.sound();  // 오류 - Sound 인터페이스 구현안함
		
	}
}
