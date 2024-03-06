package chapter2;

// 묵시적 형변환
public class ImplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		long lNum = 10; // 8바이트
		float fNum = lNum; // 4바이트, 상대적으로 작지만 덜 정밀한 수에서 더 정밀한 수로 변환된것이다. 
		System.out.println(fNum);
		
		double dNum = fNum + num; // num은 float 형으로 변경되어서 연산결과가 double로 나온다.
		System.out.println(dNum);
		
	}

}
