package lambda;

@FunctionalInterface
interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {

		PrintString lambdaString = str -> System.out.println(str);
		lambdaString.showString("test");

		showMyString(lambdaString);

		PrintString reStr = returnPrint();
		reStr.showString("hello");
	}

	// 매개변수로 전달되는 람다식
	// 람다식객체를 전달되었다.
	public static void showMyString(PrintString lambda) {
		lambda.showString("test2");
	}

	// 람다식을 반환하는 메서드
	public static PrintString returnPrint() {
		return s -> System.out.println(s + "world");
	}

}
