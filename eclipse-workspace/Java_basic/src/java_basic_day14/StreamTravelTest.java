package java_basic_day14;

import java.util.ArrayList;

class TravelCustomer {
	private String name;
	private int age;
	private int price;

	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "name: " + name + "age: " + age + "price: " + price;
	}

}

public class StreamTravelTest {

	public static void main(String[] args) {

		ArrayList<TravelCustomer> customerList = new ArrayList<>();

		customerList.add(new TravelCustomer("이순신", 40, 100));
		customerList.add(new TravelCustomer("김유신", 20, 100));
		customerList.add(new TravelCustomer("홍길동", 13, 50));

		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream().forEach(s -> System.out.println(s.getName())); // forEach만
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s)); // map사용

		System.out.println("== 총 여행 비용 ==");
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);

		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
				.forEach(s -> System.out.println(s));

	}

}
