package innerclass;

class OutClass {

	// 멤버변수
	private int num = 10;
	private static int sNum = 20;

	// 정적 내부 클래스
	static class InStaticClass {
		int iNum = 100;
		static int sInNum = 200;

		void inTest() {
			// 외부 클래스의 인스턴스 변수는 쓸 수 없다.
			// 외부 클래스의 정적 변수는 쓸 수 있다.
			// num += 10;
			sNum += 10;
			System.out.println(sNum);
			System.out.println(iNum);
			System.out.println(sInNum);

		}

		static void sTest() {

			// 정적 클래스면서 정적 메서드가 호출된다는것은
			// 모두 정적 변수들만 쓸 수 있다는 것이다.
			System.out.println(sNum);
			System.out.println(sInNum);

		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();

		OutClass.InStaticClass.sTest();
	}

}
