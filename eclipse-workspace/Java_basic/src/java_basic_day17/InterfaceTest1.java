package java_basic_day17;

// online 구매, offline구매를 예시로 이해해보기...

interface OnlineBuy {
	public void onlinebuy();
}

interface OfflineBuy {
	public void offlinebuy();
}

class Customer implements OnlineBuy, OfflineBuy {

	@Override
	public void offlinebuy() {
		System.out.println("오프라인구매");
	}

	@Override
	public void onlinebuy() {
		System.out.println("온라인구매");
	}

}

class Outer {
	
	OnlineBuy anonymousClass = new OnlineBuy() {

		@Override
		public void onlinebuy() {
			// TODO Auto-generated method stub
			System.out.println("익명클래스");
		}
	};
	
}

public class InterfaceTest1 {

	public static void main(String[] args) {
		Customer customer = new Customer(); // 고객은 온라인,오프라인 다 구매할 수 있지만

		OnlineBuy onlineCustomer = new Customer(); // 제한을 준다 온라인구매...만 하도록
		OfflineBuy offlineCustomer = new Customer(); // 오프라인구매만,,,

		customer.onlinebuy();
		customer.offlinebuy();

		onlineCustomer.onlinebuy();
		offlineCustomer.offlinebuy();

		// 익명클래스
		Outer outer = new Outer();
		outer.anonymousClass.onlinebuy();
	}

}
