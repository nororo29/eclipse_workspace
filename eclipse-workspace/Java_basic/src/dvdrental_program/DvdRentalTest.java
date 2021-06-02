package dvdrental_program;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

class DvdLibrary {
	private ArrayList<Dvd> dvdList;
	private ArrayList<Customer> customerList;

	public DvdLibrary() {
		dvdList = new ArrayList<>();
		customerList = new ArrayList<Customer>();
	}

	public ArrayList<Dvd> getDvdList() {
		return dvdList;
	}

	public void setDvdList(ArrayList<Dvd> dvdList) {
		this.dvdList = dvdList;
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	// 신규가입
	public void addCustomer(String name, String phoneNum) {
		Customer c = new Customer(name, phoneNum);
		customerList.add(c);
	}

	// 고객검색
	public Customer searchCustomer(int id) {
		Iterator<Customer> ir = customerList.iterator();
		while (ir.hasNext()) {
			Customer c = ir.next();
			if (c.getId() == id) {
				System.out.printf("이름:%s  \tid:%d  \t번호:%s\n", c.getName(), c.getId(), c.getPhoneNum());
				return c;
			}
		}
		System.out.println("id:" + id + " 존재하지 않습니다.");
		return null;
	}

	// dvd 등록
	public void addDvd(String isbn, String name, String genre) {
		Dvd d = new Dvd(isbn, name, genre);
		dvdList.add(d);
	}

	// dvd 검색
	public Dvd searchDvd(String isbn) {
		Iterator<Dvd> ir = dvdList.iterator();
		while (ir.hasNext()) {
			Dvd d = ir.next();
			if (d.getISBN().equals(isbn)) {
				System.out.printf("제목:%s  \t장르:%s  \t대출가능:%b\n", d.getName(), d.getGenre(), d.isCanRent());
				return d;
			}
		}
		System.out.println("ISBN:" + isbn + " 존재하지 않습니다.");
		return null;
	}

	// dvd 대여
	public void rentDvd(String isbn, int id) {

		Dvd d = searchDvd(isbn);
		Customer c = searchCustomer(id);

		if (d == null || c == null)
			return;

		if (c.getRentalDvd().size() >= 5) {
			System.out.println("대출 불가합니다.");
			System.out.println("1인당 5권 대출가능");
			return;
		}
		
		if (d.isCanRent()) {
			Date today = new Date();
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			String todayStr = df.format(today);

			c.getRentalDvd().add(d);
			d.setDate(todayStr);
			d.setCanRent(false);
			d.setCustomerId(id);
			System.out.println("대출하였습니다.");
		} else {
			System.out.println("대출 불가 항목입니다.");
		}
	}

	// dvd 반납
	public void returnDvd(String isbn) {
		Dvd d = searchDvd(isbn);
		Customer c = searchCustomer(d.getCustomerId());

		if (d == null || c == null)
			return;

		d.setCanRent(true);
		d.setCustomerId(-1);
		c.getRentalDvd().remove(d);
		System.out.println("반납하였습니다.");
	}

	// 대여일 대여 전체 조회
	public void rentStatus(String date) {
		Iterator<Dvd> ir = dvdList.iterator();
		while (ir.hasNext()) {
			Dvd d = ir.next();
			if (d.getDate().equals(date)) {
				System.out.printf("대여목록:%s	  \t대여자:%d\n", d.getName(), d.getCustomerId());
			}
		}
	}

	// 고객 대여dvd 조회
	public void customerRentStatus(int id) {
		Iterator<Customer> ir = customerList.iterator();
		while (ir.hasNext()) {
			Customer c = ir.next();
			if (c.getId() == id) {
				ArrayList<Dvd> dvdArr = c.getRentalDvd();
				Iterator<Dvd> ir2 = dvdArr.iterator();
				while (ir2.hasNext()) {
					Dvd d = ir2.next();
					searchDvd(d.getISBN());
				}
			}
		}
	}
}

public class DvdRentalTest {

	public static void main(String[] args) {

		DvdLibrary dl = new DvdLibrary();

		// 신규가입 (이름, 전화번호) // (이름, id, 전화번호)Customer 객체 생성 -> customerList에 저장됨
		dl.addCustomer("lucy", "010-0000-0000"); // 1001번 부터 생성
		dl.addCustomer("gina", "010-1111-0000"); // 1002
		dl.addCustomer("tom", "010-2222-0000"); // 1003

		// 고객검색 (id) // id입력하면 -> 이름, 전화번호 출력
		System.out.println("===== 고객검색 =====");
		dl.searchCustomer(1001);
		dl.searchCustomer(1002);
		dl.searchCustomer(1003);

		// dvd 등록 (ISBN, 제목, 장르) // dvd 객체 생성 => dvdList에 저장됨
		dl.addDvd("a-1000", "movie1", "music");
		dl.addDvd("a-1001", "movie2", "action");
		dl.addDvd("a-1002", "movie3", "fun");
		dl.addDvd("b-1000", "movie4", "music");
		dl.addDvd("b-1001", "movie5", "action");
		dl.addDvd("b-1002", "movie6", "action");

		// dvd 검색 (ISBN) // 제목, 장르, 대출가능여부 출력
		System.out.println();
		System.out.println("===== dvd검색 =====");
		dl.searchDvd("a-1000");
		dl.searchDvd("a-1001");
		dl.searchDvd("a-1002");
		dl.searchDvd("b-1000");
		dl.searchDvd("b-1001");
		dl.searchDvd("b-1002");

		// dvd 대여 (ISBN, 고객id) //대여가능여부 확인 -> 대여 고객 id와 날짜 입력
		System.out.println();
		System.out.println("===== dvd 대여 =====");
		dl.rentDvd("a-1000", 1001);
		System.out.println();
		dl.rentDvd("a-1001", 1001);
		System.out.println();
		dl.rentDvd("a-1000", 1002); // 대출불가
		System.out.println(); 
		dl.rentDvd("a-1002", 1001);
		System.out.println();
		dl.rentDvd("a-1002", 1003); // 대출불가
		System.out.println();
		dl.rentDvd("b-1000", 1001);
		System.out.println();
		dl.rentDvd("b-1002", 1001);
		System.out.println();
		dl.rentDvd("b-1001", 1001);

		// dvd 반납 (ISBN) //대여가능여부 가능으로,,
		System.out.println();
		System.out.println("===== dvd 반납 =====");
		dl.returnDvd("a-1000");
		System.out.println();
		dl.returnDvd("b-1000");

		// 대여 전체 조회 (대여일) //대여일에 맞는 대여 고객 전체 조회
		System.out.println();
		System.out.println("===== 대여조회 =====");
//		dl.getDvdList().forEach(s -> System.out.println(s.getDate()));
		Date today = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String date = df.format(today);
		dl.rentStatus(date);

		// 고객 대여dvd 전체 조회 (id) //전체 조회
		System.out.println();
		System.out.println("===== 고객 대여 정보 =====");
		System.out.println("-- id:1001 --");
		dl.customerRentStatus(1001);
		System.out.println("-- id:1002 --");
		dl.customerRentStatus(1002);
		System.out.println("-- id:1003 --");
		dl.customerRentStatus(1003);
	}

}
