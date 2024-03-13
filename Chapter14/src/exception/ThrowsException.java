package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	// throws - 예외의 처리를 미루려고 할때
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsException ex = new ThrowsException();
		try {
			// b.txt 파일과 java.lang.String 클래스를 가져오는 메서드
			// 둘중 하나라도 없다면 해당되는 예외가 발생한다.
			ex.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

		System.out.println("end");

	}

}
