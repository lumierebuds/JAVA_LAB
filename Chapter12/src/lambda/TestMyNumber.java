package lambda;
import lambda.MyNumber;

public class TestMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MyNumber 인터페이스에 정의된 getMaxNumber 메서드를 구현한 코드
		MyNumber maxNum = (x, y) -> (x >= y) ? x : y;

		int max = maxNum.getMaxNumber(10, 20);
		System.out.println(max);

		// 람다식은 내부적으로 익명 클래스가 생성되어서
		// 메서드에 대해 오버라이딩을 하는 식으로 구현된다.
		MyNumber aaa = new MyNumber() {

			@Override
			public int getMaxNumber(int x, int y) {
				// TODO Auto-generated method stub

				return (x >= y) ? x : y;
			}

		};

		max = aaa.getMaxNumber(1, 2);
		System.out.println(max);

	}

}
