package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		// 타입 상속: Calc 타입을 상속받았다.
		// 인터페이스를 구현한 클래스의 메서드를 호출할 수 있다.
		Calc calc = new CompleteCalc();

		// 인터페이스는 인스턴스를 생성할 수 없다.
		// Calc calc1 = new Calc();

		// 추상클래스는 인스턴스를 생성할 수 없다.
		// Calc calc2 = new Calculator();

		System.out.println(calc.divide(10, 2));
		// calc.showInfo();
		calc.description();

		int[] arr = { 1, 2, 3, 4, 5 };
		int sum = Calc.total(arr);
		System.out.println(sum);

	}

}