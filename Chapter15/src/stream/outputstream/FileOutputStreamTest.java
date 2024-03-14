package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bs = new byte[26];
		byte data = 65;
		for (int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}

		try (FileOutputStream fos = new FileOutputStream("output1.txt")) {
			fos.write(bs, 2, 5);

		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
