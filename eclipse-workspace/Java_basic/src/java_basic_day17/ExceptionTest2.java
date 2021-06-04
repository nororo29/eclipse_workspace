package java_basic_day17;

class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {  /// close() 호출하지 않아도 자동으로 호출됨
		System.out.println("리소스가  close() 되었습니다.");
	}

}

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
		
	}

}
