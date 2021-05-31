package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

class MyQueue {
	private ArrayList<Member> memberQueue = new ArrayList<Member>();
	
	public void enQueue(Member m) {
		memberQueue.add(m);
	}
	
	public Member deQueue() {
		int len = memberQueue.size();
		
		if(len == 0 ) {
			System.out.println("queue is empty");
			return null;
		}
		
		return memberQueue.remove(0);
	}
	
}

public class QueueTest {

	public static void main(String[] args) {

		MyQueue mq = new MyQueue();
		
		mq.enQueue(new Member(1, "a"));
		mq.enQueue(new Member(2, "b"));
		mq.enQueue(new Member(3, "c"));
		
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
		System.out.println(mq.deQueue());
	}

}
