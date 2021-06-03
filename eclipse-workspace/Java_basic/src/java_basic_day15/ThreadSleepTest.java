package java_basic_day15;

public class ThreadSleepTest {
	
	static void print(String message) {
		String threadName = Thread.currentThread().getName();
		System.out.printf("%s: %s\n", threadName, message);
	}
	
	private static class MessageLoop implements Runnable {
		public void run() {
			String message[] = {"a", "ab", "abc", "abcd", "abcde"};
			
			try {
				for (String s : message) {
					print(s);
					Thread.sleep(1000);  // 1000밀리 초(4초 간격으로 메세지 출력)
				}
			} catch (InterruptedException e) {  // 인터럽트되면 메세지 출력
				print("아직 안 끝남");
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		
		int tries = 0;
		
		print("추가적인 스레드를 시작합니다.");
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		print("추가적인 스레드가 끝나기를 기다립니다.");
		while (t.isAlive()) {
			print("아직 기다립니다.");
			t.join(1000);  //t가 종료하기를 1초동안 기다린다.
			tries++;
			if (tries > 2) {
				print("참을 수 없네요");
				t.interrupt();  //t 강제로 종료
				t.join(); // t가 종료하기 기다림
			}
		}
		
		print("메인 스레드 종료");
		
	}

}
