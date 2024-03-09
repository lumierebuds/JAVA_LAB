package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("X()");

	}

	@Override
	public void y() {
		// TODO Auto-generated method stub
		System.out.println("Y()");
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		System.out.println("myMethod()");

	}

	public static void main(String[] args) {
		MyClass mc = new MyClass();

		// 변경되는 인터페이스 타입에 따라 사용할 수있는 메서드는 한정적이다.
		X xClass = mc;
		xClass.x();

	}

}
