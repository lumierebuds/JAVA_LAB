package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {

	// Member를 ArrayList에 관리하도록 하는 클래스

	private ArrayList<Member> arrayList;

	public MemberArrayList() {

		arrayList = new ArrayList<Member>();
	}

	// 회원 추가
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 회원 삭제
	public boolean removeMember(int memberId) {

		// arraList 인덱스의 값을 순회하면서
		// id 값을 확인후 삭제

		/*
		for (int i = 0; i < arrayList.size(); i++) { // arrayList에 저장된 i번째 인덱스의 member 객체 반환
			Member member = arrayList.get(i); // member 객체의 id 반환
			int tempId = member.getMemberId();
		
			if (memberId == tempId) {
				arrayList.remove(i);
				return true;
			}
		}
		*/

		// iterator
		Iterator<Member> iterator = arrayList.iterator();

		// 가져올 요소가 있는 동안
		while (iterator.hasNext()) {
			// next() 메서드: 다음 member를 반환한다.
			Member member = iterator.next();

			int tempId = member.getMemberId();
			if (memberId == tempId) {
				arrayList.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAll() {

		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println(arrayList);
		System.out.println();
	}

}
