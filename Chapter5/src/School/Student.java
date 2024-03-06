package School;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject();
		math = new Subject();
	}
	
	public Student(int id, String name) {
		
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	// 국어이름, 점수 설정
	public void setKorea(String name, int score) {
		korea.setSubjectName(name);
		korea.setSubjectScore(score);
	}
	
	// 수학이름, 점수 설정
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setSubjectScore(score);
	}
	
	// 합계점수 
	public void showStudentInfo() {
		int total = korea.getSubjectScore() + math.getSubjectScore();
		System.out.println(studentName+" 학생의 모든 과목 총점은 "+total+"점입니다.");
	}
	
}
