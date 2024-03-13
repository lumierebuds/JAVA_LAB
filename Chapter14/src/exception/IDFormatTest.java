package exception;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {
		if (userID == null) {
			throw new IDFormatException("아이디는 null 일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IDFormatTest idTest = new IDFormatTest();

		String userID = null;

		// id가 null 일때
		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}

		// id가 8자 이상 20자 이하일때
		userID = "abcdefg";

		try {
			idTest.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
