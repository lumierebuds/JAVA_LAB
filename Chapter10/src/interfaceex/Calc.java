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

}
