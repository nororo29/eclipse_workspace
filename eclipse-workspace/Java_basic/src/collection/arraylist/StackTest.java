package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

class MyStack {
	private ArrayList<Member> memberStack = new ArrayList<Member>();
	
	public void push(Member m) {
		memberStack.add(m);
	}
	
	public Member pop() {
		int len = memberStack.size();
		if (len == 0) {
			System.out.println("stack is empty");
			return null;
		} 
		
		return (memberStack.remove(len - 1));
	}
}

public class StackTest {
	public static void main(String[] args) {
		MyStack st = new MyStack();
		
		st.push(new Member(1, "a"));
		st.push(new Member(2, "b"));
		st.push(new Member(3, "c"));
		
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}
