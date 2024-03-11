package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		Class strClass = Class.forName("java.lang.String");

		// 생성자 리스트에 "java.lang.String" 클래스의 생성자 정보를 출력한다.
		Constructor[] cons = strClass.getConstructors();

		for (Constructor con : cons) {
			System.out.println(con);
		}

		// 멤버 변수
		Field[] fields = strClass.getFields();

		for (Field f : fields) {
			System.out.println(f);
		}

		// 메서드
		Method[] methods = strClass.getMethods();

		for (Method m : methods) {
			System.out.println(m);
		}
	}

}
