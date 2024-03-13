package lambda;

// 인터페이스에 선언된 하나의 메서드를 정의하기 위해
// 함수형 프로그래밍을 뜻하도록
// @FunctionalInterface 애노테이션을 붙인다. 
@FunctionalInterface
public interface MyNumber {

	int getMaxNumber(int num1, int num2);

	// int testMaxNuber();

}
