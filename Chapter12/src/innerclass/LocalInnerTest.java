package innerclass;

class Outer {

	int outNum = 100;
	static int sNum = 200;

	Runnable runnable = new Runnable() {

		@Override
		public void run() {

			// TODO Auto-generated method stub
			System.out.println("runnable");
		}

	};

	public Runnable getRunnable(final int i) {

		int localNum = 100;

		// 익명 내부 클래스

		return new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				outNum += 10;

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
		Runnable runnable = outer.getRunnable(20);

		// 익명 내부 클래스

		outer.runnable.run();

	}

}
