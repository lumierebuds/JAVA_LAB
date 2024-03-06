package chapter2;

public class CharacterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A'; // char에 문자를 대입하려면 작은따옴표
		
		System.out.println(ch);
		System.out.println((int)ch); // ch의 값을 int 형으로 출력
		
		ch = 66;	// 아스키코드값이 65일때는 A, 66일때는 B 
		
		System.out.println(ch);
		
		int ch2 = 65;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		
	}

}
