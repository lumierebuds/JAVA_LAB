package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 30;
		
		int result = addNum(num1, num2);
		System.out.println(num1+"+"+num2+"은 "+result);
		
	}
	
	public static int addNum(int n1,int n2) {
		int result = n1 + n2; 
		return result;
	}
}
