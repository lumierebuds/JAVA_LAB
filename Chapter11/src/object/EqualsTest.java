package object;

class Student {
	int studentID;
	String studentName;

	Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student) {
			// 다운캐스팅
			Student std = (Student) obj;
			if (studentID == std.studentID)
				return true;
			else
				return false;
		}
		return false;
	}

	public int hashCode() {
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		// 둘이 같은 주소인지 확인, false 출력
		System.out.println(str1 == str2);
		// 두 인스턴스의 문자열이 같은지 확인, true 출력
		// equals의 원형은 주소값을 확인하는것인데 String에서는 문자열 값을 확인한다.
		System.out.println(str1.equals(str2));

		Student std1 = new Student(10001, "Tomas");
		Student std2 = new Student(10001, "Tomas");

		System.out.println(std1 == std2);
		// 원래는 false가 출력되나, equals 메서드를 재정의 해서
		// 같은 ID 값일때 true를 반환하도록 한다.
		System.out.println(std1.equals(std2));

		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());

	}

}
