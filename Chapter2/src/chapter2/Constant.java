package chapter2;

public class Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		// 상수의 장점: 코드 작성중에 특정한 의미의 값으로 부여할 수 있다.
		final int STUDENT_NUM = 30;
		
		int num = 30;
		
		if(num == STUDENT_NUM) {
			System.out.printf("%d is matched %d", num, STUDENT_NUM);
		}
		
	}

}
