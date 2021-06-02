package java_basic_day15;

public class ExLoginService {
	
	class MemberService {
		String id = "gina";
		String pw = "12345";
		
		public MemberService() {}
		
		public boolean login(String id, String pw) {
			if (this.id.equals(id) && this.pw.equals(pw))
				return true;
			else
				return false;
		}
		public void logout(String id) {
			if (this.id.equals(id))
				System.out.println("로그아웃");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExLoginService outer = new ExLoginService();
		MemberService memberService = outer.new MemberService();
		
		//1. login()
		boolean result = memberService.login("gina", "12345");
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			// 2. logout()
			memberService.logout("gina");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
