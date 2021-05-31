package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}
	
	public void insertMember(Member m, int index) {
		arrayList.add(index, m);
	}
}
