package java_basic_day11;

public class Child extends Parent {
	public String childName;
	public int id;
	
	public Child(String pn, String cn, int i) {
		super(pn);
		this.childName = cn;
		id = i;
	}
	
	@Override
	public void info() {
		System.out.println(super.name + "가족의 " + childName + "입니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent("홍");
		p1.info();
		
		Child c1 = new Child("홍", "길동", 1);
		c1.info();
	}

}

