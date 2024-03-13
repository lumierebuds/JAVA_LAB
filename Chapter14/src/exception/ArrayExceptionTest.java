package exception;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		try {
			for (int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위를 벗어났습니다.");

		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}

}
