package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("a.txt")) {

		} catch (IOException e) {
			// 파일이 없을때 닫으려고 한다면, 입출력 에러가 발생
			System.out.println(e);
		}
		System.out.println("end");
	}

}
