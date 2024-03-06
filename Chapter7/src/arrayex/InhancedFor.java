package arrayex;

public class InhancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"Java", "Android","C"};
		
		// 기존의 for문
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		// 향상된 for문
		for(String s: str) {
			System.out.println(s);
		}
		
		int[] arr = {30, 40, 50};
		
		for(int num: arr) {
			System.out.println(num);
		}
	}

}
