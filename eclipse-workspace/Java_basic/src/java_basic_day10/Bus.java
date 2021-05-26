package java_basic_day10;

public class Bus {
	
	private String name;
	private int number;
	
	public Bus(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		// Bus필드 name, number 사용하기
		Bus b1 = new Bus("bus100", 100);
//		System.out.println(b1.name);   -> private라 사용못함
		System.out.println(b1.getName() + " " + b1.getNumber());
		
	}

}
