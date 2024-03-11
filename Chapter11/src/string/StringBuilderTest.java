package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("java");

		System.out.println(System.identityHashCode(str1));

		StringBuilder buffer = new StringBuilder(str1);

		// 추가 전 메모리 주소
		System.out.println(System.identityHashCode(buffer));

		buffer.append(" and");
		buffer.append(" android");
		// 추가 후 메모리 주소
		System.out.println(System.identityHashCode(buffer));

		// 문자열 반환해 String 변수 정의
		String str2 = buffer.toString();
		System.out.println(str2);

		Integer i = 100;
	}

}
