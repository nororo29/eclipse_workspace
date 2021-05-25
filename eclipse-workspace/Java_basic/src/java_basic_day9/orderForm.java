package java_basic_day9;

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
		String dateString = new SimpleDateFormat("yyyy년 MM월 dd일").format(date);
		
		System.out.printf("주문 번호 : %.0f\n", orderId);
		System.out.println("주문자 아이디 : " + clientId);
		System.out.println("주문 날짜 : " + dateString);
		System.out.println("주문자 이름 : " + clientName);
		System.out.println("주문 상품 번호 : " + orderNum);
		System.out.println("배송 주소 : " + address);
	}
	
	public static void main(String[] args) {
		orderForm o1 = new orderForm();
		
		o1.orderId = 201803120001d;
		o1.clientId = "abc123";
		o1.date = new Date();
		o1.clientName = "홍길순";
		o1.orderNum = "PD0345-12";
		o1.address = "서울시 영등포구 여의도동 20번지";
		
		o1.printOrder();
	}
}
