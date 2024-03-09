package interfaceex;

public interface Calc {

	// interface에서는 상수와 추상 메서드가 선언된다.
	// 멤버변수처럼 선언된 변수들이 상수로서 작동

	// public static double PI = 3.14로 변경
	double PI = 3.14;
	int ERROR = -99999999;

	int add(int num1, int num2);

	int substrat(int num1, int num2);

	int times(int num1, int num2);

	int divide(int num1, int num2);

	// default 예약어를 붙여 만든 default 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}

	// static 메서드

	static int total(int[] arr) {
		int total = 0;

		for (int i : arr) {
			total += i;
		}
		return total;
	}

}
