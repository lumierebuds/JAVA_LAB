package generics;

public class Powder extends Material {
	public String toString() {
		return "재료는 Powder 입니다.";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("Powder 재료로 출력합니다.");
	}
}
