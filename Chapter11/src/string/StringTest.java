package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("java");
		String str2 = new String("android");

		// str1의 문자열 연결전 메모리값
		System.out.println(System.identityHashCode(str1));

		// concat: 문자열 연결메서드
		// 저장된 문자열 자체는 변경되지 않는다.
		str1 = str1.concat(str2);

		// str1의 문자열 연결후 메모리값
		System.out.println(System.identityHashCode(str1));

		System.out.println(str1);
	}

}
