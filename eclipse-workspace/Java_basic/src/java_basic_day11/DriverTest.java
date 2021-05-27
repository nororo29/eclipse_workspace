package java_basic_day11;

import java.util.ArrayList;

class Driver {
	public void drive(Vehicle v) {
		v.run();
	}
}

class Vehicle {
	public void run() {
		System.out.println("달린다.");
	}
	public void info() {}
}

class Bus extends Vehicle {
	int busNum;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
	@Override
	public void info() {
		System.out.println(busNum + "노선을 달린다");
	}
}

class Taxi extends Vehicle {
	int taxiNum;
	
	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	@Override
	public void run() {
		System.out.println("택시가 달린다.");
	}
	
	@Override
	public void info() {
		System.out.println(taxiNum + "택시에 승객이 탑승");
	}
}

public class DriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d1 = new Driver();
		
		ArrayList<Vehicle> vehicleList = new ArrayList<>(5);
		
		for (int i = 0; i < 3; i++) {
			vehicleList.add(new Bus(i + 1));
			vehicleList.add(new Taxi(i + 1));
		}
		
		
		for (Vehicle vehicle : vehicleList) {
			d1.drive(vehicle);
			vehicle.info();
		}
	
		
	}

}
