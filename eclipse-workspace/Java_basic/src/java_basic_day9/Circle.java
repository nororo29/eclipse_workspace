package java_basic_day9;

public class Circle {
	
	String name;
	double radius;
	
	public Circle(String n, double r) {
		name = n;
		radius = r;
	}
	
	public void getArea() {
		double area = 3.14 * radius * radius;
		System.out.println(name + "의 면적은 " + area);
	}

	
	public static void main(String[] args) {
		Circle c1 = new Circle("피자", 10);
		Circle c2 = new Circle("도넛", 2);
		
		c1.getArea();
		c2.getArea();
	}

}
