package collection;

import collection.arraylist.MemberArrayList;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");

		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberShin);

		// 삭제하기전 정보
		memberArrayList.showAll();

		memberArrayList.removeMember(memberKim.getMemberId());

		// 삭제한후 정보
		memberArrayList.showAll();
	}

}
