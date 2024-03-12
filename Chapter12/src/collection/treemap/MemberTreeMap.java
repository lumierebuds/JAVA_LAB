package collection.treemap;

import java.util.Iterator;
import java.util.TreeMap;

import collection.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;

	public MemberTreeMap() {
		// 매개변수로
		treeMap = new TreeMap<Integer, Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {

		// Key 값에 대한 값이 존재할때
		if (treeMap.containsKey(memberId)) {

			// id 값에 대한 데이터를 삭제
			treeMap.remove(memberId);
			return true;
		}

		System.out.println(memberId + " ID의 회원은 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		// treeMap의 키에 해당하는 iterator 반환
		Iterator<Integer> ir = treeMap.keySet().iterator();

		while (ir.hasNext()) {
			int key = ir.next();

			Member member = treeMap.get(key);
			System.out.println(member);
		}

	}

}
