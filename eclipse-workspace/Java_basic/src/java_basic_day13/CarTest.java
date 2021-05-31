package java_basic_day13;

import java.util.HashMap;

class Car {
	String name;
	public Car() {}
	public Car(String name) {
		this.name = name;
	}
}

class CarFactory {
	private static CarFactory instance;
	HashMap<String, Car> carMap;
	
	public CarFactory() {
		carMap = new HashMap<String, Car>();
	}
	
	public static CarFactory getInstance() {
		if (instance == null)
			instance = new CarFactory();
		return instance;
	}
	
	public Car createCar(String name) {
		if (carMap.containsKey(name)) {
			return carMap.get(name);
		}
		Car c = new Car();
		carMap.put(name, c);
		return c;
	}
	
	
}

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata1 = factory.createCar("연수 차");
		Car sonata2 = factory.createCar("연수 차");
		System.out.println(sonata1 == sonata2);
		
		Car avante1 = factory.createCar("승연 차");
		Car avante2 = factory.createCar("승연 차");
		System.out.println(avante1 == avante2);
		
		System.out.println(sonata1 == avante1);
	}

}
