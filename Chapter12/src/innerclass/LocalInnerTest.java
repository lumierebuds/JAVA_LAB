package innerclass;

class Outer {

	int outNum = 100;
	static int sNum = 200;

	// Runnable 타입의 runnable 변수에
	// new 생성자로 객체 반환 - 익명 내부 클래스와 비슷
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub

			System.out.println("runnable");
		}
	};

	// 익명 내부 클래스
	public Runnable getRunnable(int i) {

		int localNum = 100;

		// 메서드가 호출될때 이름이 없는 내부 클래스를 반환해준다.
		// 클래스 이름이 없는 내부 클래스
		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
			}
		};
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer outer = new Outer();
		outer.getRunnable(20).run();
		outer.runnable.run();
	}

}
