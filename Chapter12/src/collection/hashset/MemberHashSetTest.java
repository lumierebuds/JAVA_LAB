package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberHashSet memberHashSet = new MemberHashSet();

		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);

		memberHashSet.showAll();

		// 동일한 id 값의 member를 추가하면
		// memberHashSet에 추가되지 않는다.
		// ** Member 클래스에서 equals,hashCode 를 구현해줬다. **

		Member memberLee2 = new Member(101, "이몽룡");

		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();

	}

}
