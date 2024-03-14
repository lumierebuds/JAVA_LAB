package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("알파멧 여러개를 쓰고 엔터를 누르세요.");
		int i = 0;

		try {
			while ((i = System.in.read()) != '\n') {
				System.out.println((char) i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
