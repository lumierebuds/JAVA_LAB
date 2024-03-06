package classpart;

// 클래스의 이름은 대문자로 시작
public class Student {
	
	int studentID; 		// 학생 학번
	String studentName; // 학생 이름
	int grade; 			// 학생 학년
	String address; 	// 학생 성적
	
	// 기본 생성자 
	public Student() {
		
	}
	
	// 매개변수가 있는 생성자 
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	
	// 이름과 주소를 출력하는 메서드 
	public void showStudentInfor() {
		System.out.println(studentName + ", "+address);
	}
	
	// 이름을 반환하는 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// 이름을 설정하는 메서드  
	public void setStudentName(String name) {
		studentName = name;
	}
	
	

}
