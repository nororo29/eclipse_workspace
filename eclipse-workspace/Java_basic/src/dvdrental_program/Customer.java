package dvdrental_program;

import java.util.ArrayList;

public class Customer {
	private static int serialNum = 1000;
	private String name;
	private int id;
	private String phoneNum;
	private ArrayList<Dvd> rentalDvd;

	public Customer(String name, String phoneNum) {
		serialNum++;
		this.name = name;
		this.phoneNum = phoneNum;
		this.id = serialNum;
		rentalDvd = new ArrayList<Dvd>(5);  // 최대 5개 빌리는 것 가능
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public ArrayList<Dvd> getRentalDvd() {
		return rentalDvd;
	}

	public void setRentalDvd(ArrayList<Dvd> rentalDvd) {
		this.rentalDvd = rentalDvd;
	}
}
