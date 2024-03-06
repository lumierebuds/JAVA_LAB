package chapter2;

public class EXplicitConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 3 + 0
		int num2 = (int)(dNum + fNum); // (int) (3.14+ 0.9 = 4.23) 
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
