package java_basic_day17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;

		try {   // "a.txt" 파일에서 데이터 읽어들이기
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {  // 지정된 파일을 찾을 수 없을 때
			System.out.println(e);
			return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("여긴 return되도 항상 출력");  // 정상 출력	
		}
		
		System.out.println("이전에 return되면 출력안됨");
	}

}
