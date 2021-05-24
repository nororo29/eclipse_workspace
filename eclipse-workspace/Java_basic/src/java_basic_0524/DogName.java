package java_basic_0524;

import java.util.Arrays;
import java.util.Scanner;

public class DogName {

	public static void main(String[] args) {
		// 애완견 이름 "곰돌이", "복돌이", "흰둥이", "깨소금", "까만콩"
		// 애완견 이름 입력되면 영어로 변환해서 출력
		Scanner sc = new Scanner(System.in);
		
		String[] dog = {"곰돌이", "복돌이", "흰둥이", "깨소금", "까만콩"};
		String[] dog2 = {"Bear", "Gift", "White", "Sesami", "Black"};
		
		String myDog = sc.nextLine();
		int i = Arrays.asList(dog).indexOf(myDog);
		
		if (i == -1) {
			System.out.println("찾는 이름이 없습니다.");
			return ;
		}
		
		System.out.println(dog2[i]);
	}

}
