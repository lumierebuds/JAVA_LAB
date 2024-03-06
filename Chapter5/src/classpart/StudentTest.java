package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(); // 힙 메모리에 객체 생성
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student(100, "미국 산호세");
//		studentKim.studentName = "김유신";
//		studentKim.studentID = 101;
//		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}

}
