package abstractex;

public class ComputerTest {
	public static void main(String[] args) {

		// 추상 클래스는 인스턴스화 할 수 없다.
		// Computer c1 = new Computer();

		// 업캐스팅 해서 Computer 타입으로 생성
		Computer c2 = new DeskTop();
		// Computer c3 = new NoteBook();

		MyNoteBook c4 = new MyNoteBook();

		c2.display();
		c4.display();
	}

}
