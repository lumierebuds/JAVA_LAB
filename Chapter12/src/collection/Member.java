package collection;

public class Member implements Comparable<Member> {

	// 회원클래스

	private int memberId;

	private String memberName;

	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;

	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if (this.memberId == member.memberId) {
				return true;
			} else
				return false;
		}
		return false;
	}

	// 추가되는 객체를 비교한다.
	// 중복되면 저장 x
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub

		return (this.memberName.compareTo(member.memberName));

	}

}
