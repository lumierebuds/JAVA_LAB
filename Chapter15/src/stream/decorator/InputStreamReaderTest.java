package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InputStreamReader: 보조스트림에 해당
		try (InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;

			while ((i = irs.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}

		Socket socket = new Socket();
		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
