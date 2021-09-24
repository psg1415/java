package chapter12_2.hashmap;

import java.util.HashMap;
import chapter12_2.Member;
import java.util.*;

public class MemberHashMap {
	private HashMap<Integer, Member> members;
	
	public MemberHashMap() {
		members = new HashMap<Integer, Member>();
	}
	
	/**추가*/
	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
	}
	
	/**삭제*/
	public boolean removeMember(int memberId) {
		//containKey -> 키값이 존재하는지 
		if(members.containsKey(memberId)) {
			members.remove(memberId);
			return true;
		}
		
		return false;
	}
	
	/**조회*/
	public void showMembers() {
		//Map -> 순서 X, Key 값이 Set 자료형 -> Set에서 Iterator 사용
		Iterator<Integer> ir = members.keySet().iterator();
		/**
		 * hasNext() -> 다음 요소가 있는지 체크, true, false
		 * next() -> 다음요소
		 */
		
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = members.get(key);
			System.out.println(member);
		}
	}
}
