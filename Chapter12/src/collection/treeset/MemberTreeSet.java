package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {

		treeSet = new TreeSet<Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		treeSet.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {

		// iterator
		Iterator<Member> iterator = treeSet.iterator();

		// 가져올 요소가 있는 동안
		while (iterator.hasNext()) {
			// next() 메서드: 다음 member를 반환한다.
			Member member = iterator.next();

			int tempId = member.getMemberId();
			if (memberId == tempId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;

	}

	public void showAll() {

		for (Member member : treeSet) {
			System.out.println(member);
		}

		System.out.println(treeSet);
		System.out.println();
	}

}
