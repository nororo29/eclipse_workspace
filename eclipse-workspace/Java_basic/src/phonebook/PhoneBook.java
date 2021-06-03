package phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PhoneBook {
	Map<String, Phone> phonebook;
	
	public PhoneBook() {
		phonebook = new HashMap<String, Phone>();
	}
	
	// 입력(이름, 번호) -> 객체생성, 전화번호부에 저장
	public void putNumber(String name, String num) {
		Phone phone = new Phone(name, num);
		phonebook.put(num, phone);
	}
	
	// 전체출력() -> 전체객체 출력
	public void showAllNumber() {
		System.out.println(phonebook);
	}
	
	// 검색(이름 or 번호) -> 없는정보입니다 or 이름,번호 출력
	public void searchPhone(String n) {
		for (Phone p : phonebook.values()) {
			if (p.getName().equals(n) || p.getNum().equals(n)) { // 이름이 같거나 번호가 같으면 출력
				System.out.println(p.print());
				return;
			}
		}
		System.out.println("없는 정보입니다.");
	}
	
	// 삭제(이름 or 번호) -> 삭제
	public void deletePhone(String n) {
		for (Phone p : phonebook.values()) {
			if (p.getName().equals(n) || p.getNum().equals(n)) {
				System.out.println(phonebook.get(p.getNum()) + "님의 번호가 삭제되었습니다.");
				phonebook.remove(p.getNum());
				return;
			}
		}
		System.out.println("없는 정보입니다.");
	}
	
	// 변경(이름 or 번호) -> 없는 이름입니다 or 새로운번호를 입력하시오 -> 번호 바꿈
	public void updatePhone(String n) {
		for (Phone p : phonebook.values()) {
			if (p.getName().equals(n) || p.getNum().equals(n)) {
				Scanner sc = new Scanner(System.in);
				
				System.out.print("새로운 번호를 입력하시오 : ");
				String newNum = sc.nextLine();
				
				// 새로입력한 번호가 숫자로 이뤄졌는지 검사
				try {
					double d = Double.parseDouble(newNum);
				} catch (NumberFormatException e) {
					System.out.println("번호오류");
					sc.close();
					return;
				}
				
				// 새로입력한번호를 key로, 예전 Phone객체를 value로 하고 객체 삭제
				phonebook.put(newNum, phonebook.remove(p.getNum()));
				p.setNum(newNum); // 예전 Phone객체 번호 변경
				
				System.out.println(phonebook.get(p.getNum()) + "님의 번호가 변경되었습니다.");
				sc.close();
				return;
			}
		}
		System.out.println("없는 정보입니다.");
	}
	
	// 종료() -> 종료문 출력...
	public void exit() {
		System.out.println("종료되었습니다.");
	}
	
}