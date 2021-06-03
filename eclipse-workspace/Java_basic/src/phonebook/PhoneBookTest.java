package phonebook;

public class PhoneBookTest {

	public static void main(String[] args) {
//		전화번호 관리 프로그램
		PhoneBook pb = new PhoneBook();
		
//		전화번호 입력
		// (이름, 번호) -> 객체생성, 전화번호부에 저장
		pb.putNumber("lucy", "01011111111");
		pb.putNumber("gina", "01011112222");
		pb.putNumber("tom", "01011113333");
		
//		전체 정보 출력
		// () -> 전화번호부에 저장된 객체들 출력
		pb.showAllNumber();
		
//		전화번호 검색
		// (이름) -> 없는 정보입니다 or 이름,번호 출력
		// (전화번호) -> 없는 정보입니다 or 이름,번호 출력
		pb.searchPhone("01011111111");
		pb.searchPhone("gina");
		
//		전화번호 삭제
		// (이름) -> 전화번호부에서 삭제
		// (번호) -> 전화번호부에서 삭제
		pb.deletePhone("lucy");
		pb.deletePhone("01011111111");
		pb.showAllNumber();
		
//		전화번호 변경
		// (이름) -> 없는 이름입니다 or 새로운번호를 입력하시오 -> 번호 바꿈
		// (번호) -> 없는 번호입니다 or 새로운번호를 입력하시오 -> 번호 바꿈
		pb.updatePhone("lucy");
		pb.updatePhone("01011112222");
		
//		종료?
		// exit() -> 종료문 출력...
		pb.exit();
	}

}
