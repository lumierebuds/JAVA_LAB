package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberTreeSet memberTreeSet = new MemberTreeSet();

		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");

		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberShin);

		memberTreeSet.showAll();

		// 동일한 id 값의 member를 추가하면
		// memberTreeSet에 추가되지 않는다.
		// ** Member 클래스에서 equals,hashCode 를 구현해줬다. **

		Member memberLee2 = new Member(101, "이몽룡");

		memberTreeSet.addMember(memberLee2);
		memberTreeSet.showAll();
	}

}
