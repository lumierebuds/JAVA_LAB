package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;

	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();

	}

	public void addMember(Member member) {

		hashMap.put(member.getMemberId(), member);

	}

	public boolean removeMember(int memberId) {
		// Key 값에 대한 값이 존재할때
		if (hashMap.containsKey(memberId)) {

			// id 값에 대한 데이터를 삭제
			hashMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + " ID의 회원은 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		// hashMap의 키에 해당하는 iterator 반환
		Iterator<Integer> ir = hashMap.keySet().iterator();

		while (ir.hasNext()) {
			int key = ir.next();

			Member member = hashMap.get(key);
			System.out.println(member);
		}

	}
}
