package arrayex;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alphabets = new char[26];
		
		char ch = 'A';
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch++; // 아스키 코드값을 1씩 증가 
		}
		
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i]);
		}
	}

}
