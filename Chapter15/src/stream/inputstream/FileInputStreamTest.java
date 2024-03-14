package stream.inputstream;

import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fis = null;
		int i = 0;
		try {
			fis = new FileReader("input.txt");
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);

			}
		} catch (IOException e) {
			// 파일이 없을때
			System.out.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end");

	}

}
