package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet() {

		hashSet = new HashSet<Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		hashSet.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {

		// iterator
		Iterator<Member> iterator = hashSet.iterator();

		// 가져올 요소가 있는 동안
		while (iterator.hasNext()) {
			// next() 메서드: 다음 member를 반환한다.
			Member member = iterator.next();

			int tempId = member.getMemberId();
			if (memberId == tempId) {
				hashSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;

	}

	public void showAll() {

		for (Member member : hashSet) {
			System.out.println(member);
		}

		System.out.println(hashSet);
		System.out.println();
	}

}
