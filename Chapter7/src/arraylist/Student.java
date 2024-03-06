package arraylist;

import java.util.ArrayList;

public class Student {
	
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		// 과목 객체 생성
		Subject subject = new Subject();
		// 과목 객체의 이름, 점수 설정
		subject.setName(name);
		subject.setScore(score);
		
		// 과목 ArrayList에 과목정보 저장
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject subject: subjectList) {
			System.out.println("학생" + studentName +"님의"+ subject.getName() 
					+" 과목의 성적은"+subject.getScore()+"점 입니다.");
			total +=subject.getScore();
		}
		
		System.out.println("학생"+studentName+"님의 총점은"+total+"점 입니다.");
	}
	
	
	

	
}
