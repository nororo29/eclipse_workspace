package java_basic_day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class orderForm {
	double orderId;
	String clientId;
	Date date;
	String clientName;
	String orderNum;
	String address;

	public void printOrder() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");

		System.out.printf("주문 번호 : %.0f\n", orderId);
		System.out.println("주문자 아이디 : " + clientId);
		System.out.println("주문 날짜 : " + df.format(date));
		System.out.println("주문자 이름 : " + clientName);
		System.out.println("주문 상품 번호 : " + orderNum);
		System.out.println("배송 주소 : " + address);
	}

	public static void main(String[] args) throws ParseException {
		
		orderForm o1 = new orderForm();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		o1.orderId = 201803120001d;
		o1.clientId = "abc123";
		o1.date = df.parse("2018-10-3");
		o1.clientName = "홍길순";
		o1.orderNum = "PD0345-12";
		o1.address = "서울시 영등포구 여의도동 20번지";

		o1.printOrder();
	}
}
