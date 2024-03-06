package staticex;

public class Student {
	
	private static int serialNum = 10000;
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	int studentId;
	String studentName;

	public Student() {
		this.studentId = ++serialNum;
	}
	

	
}
