package innerclass;

class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass() {
		inClass = new InClass();
	}

	// 인스턴스 내부 클래스
	private class InClass {
		int inNum = 200;
		// 내부 클래스는 static 변수를 선언할 수 없다.
		// 대신에 사용할 수 있다.
		// static int sInNum = 100;

		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}

	}

	public void usingInTest() {
		inClass.inTest();
	}

	// 정적 내부 클래스
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// 외부 클래스의 인스턴스 변수는 쓸 수 없다.
			// 인스턴스가 생성되지 않을 수 있기때문
			// num += 10;

			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);
		}

		static void sTest() {
			System.out.println(sNum);
			System.out.println(sInNum);
		}

	}
}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutClass outClass = new OutClass();
		outClass.usingInTest();

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();

		OutClass.InStaticClass.sTest();

	}

}
