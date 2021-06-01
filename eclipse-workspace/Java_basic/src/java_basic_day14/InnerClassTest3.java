package java_basic_day14;

// 외부 클래스
public class InnerClassTest3 {
	
	int a;
	static final int A = 10;
	
	public InnerClassTest3() {}
	
	// 인스턴스 내부 클래스
	public class InstanceInner {
		
		int abc;
		static final int B = 10;
		
		// 생성자
		public InstanceInner() {}
		
		// 메소드
		public void print() {
			abc = 1000;
			System.out.println(abc);
			System.out.println(B);
			System.out.println(a);
			System.out.println(A);
		}
		
	}
	
	// 정적 내부 클래스
	static class StaticInner {
		
		int abcd;
		static final int C = 10;
		
		// 생성자
		public StaticInner() {}
		
		// 메소드
		public void print() {
			System.out.println(abcd);
//			System.out.println(a);
			System.out.println(A);
			System.out.println(C);
		}
		
	}
	
	void method() {
		class ABC {// 지역 내부 클래스 - 메서드 내부 클래스
			
			int abcde = 10;
//			static int D = 100;  // 메소드 안에서는 static안됨
			
			// 생성자
			public ABC() {}
			
		}
		
		ABC abc = new ABC();
		abc.abcde = 100;
		
	}
	
	// 익명 클래스1
	Object method2() { // Object 반환하는
		return new Object() { // Object 반환
			
			@Override
			public String toString() {
				return InnerClassTest3.class.getName();
				
			}
		};
	}
	
	// 익명 클래스2
	Object o = new Object() {
		
		@Override
		public String toString() {
			return super.toString();
			
		}
	};
	
	
	Runnable method3() {
		return new Runnable() {
			
			@Override
			public void run() {  // 꼭 구현해야함.
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	

}
