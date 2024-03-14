package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");

		rf.writeInt(100); // 4
		System.out.println(rf.getFilePointer()); // 파일의 포인터 위치를 출력
		rf.writeDouble(3.14); // 8
		System.out.println(rf.getFilePointer());
		rf.writeUTF("안녕하세요"); // 12 +(3 * 5 +2) = 29
		System.out.println(rf.getFilePointer());

		rf.seek(0); // 파일 포인터 위치를 0 번째로 이동
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();

		System.out.println(i);
		System.out.println(d);
		System.out.println(str);

	}

}
