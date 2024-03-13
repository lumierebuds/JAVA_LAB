package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		// TODO Auto-generated method stub
		if (s1.getBytes().length >= s2.getBytes().length)
			return s2;
		else
			return s1;
	}

}

public class ReduceTest {

	public static void main(String[] args) {

		String[] greetings = { "안녕하세요~~", "Hello", "Good Morning", "반갑습니다." };

		// reduce 연산을 구현
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		}));

		// BinaryOperator를 바로 쓸때
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
