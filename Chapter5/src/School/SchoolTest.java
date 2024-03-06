package School;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student(100,"James");
		studentJames.setKorea("한국어", 100);
		studentJames.setMath("수학", 88);
		studentJames.showStudentInfo();
		
		Student studentTomas = new Student(100,"James");
		studentTomas.setKorea("한국어", 99);
		studentTomas.setMath("수학", 20);
		studentTomas.showStudentInfo();
	}

}
