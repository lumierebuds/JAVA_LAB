package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 복사되는 시간을 확인하기 위한 변수
		long milliseconds = 0;
		int len = 0;

		// a.exe 의 내용을 하나씩 복사해서 b.exe 에 저장
		try (FileInputStream fis = new FileInputStream("a.exe")) {
			FileOutputStream fos = new FileOutputStream("b.exe");

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// 현재 시간을 저장
			milliseconds = System.currentTimeMillis();
			int i;
			while ((i = fis.read()) != -1) {
				bos.write(i);
				len++;
			}

			// 끝난 시간 - 시작한 시간
			milliseconds = System.currentTimeMillis() - milliseconds;
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println(len);
		System.out.println(milliseconds);
	}

}
