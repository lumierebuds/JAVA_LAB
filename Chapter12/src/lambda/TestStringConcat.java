package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 객체지향 프로그래밍 방식
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");

		// 람다함수형 프로그래밍 방식
		StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat.makeString("hello", "java");

		// 내부적으로 람다 함수형프로그래밍이 일어나는 방식
		// 익명 내부 클래스 방식
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(s1 + " " + s2);
			}

		};

		concat2.makeString("hello", "java");

	}

}
