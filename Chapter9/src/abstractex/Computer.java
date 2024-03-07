package abstractex;

public abstract class Computer {

	// 구현부가 없는 abstract 메서드
	// 구현부: {}
	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 킵니다!");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다!");
	}

}
