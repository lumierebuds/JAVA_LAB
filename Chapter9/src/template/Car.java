package template;

public abstract class Car {

	public abstract void drive();

	public abstract void stop();

	public abstract void wiper();

	public void washCar() {
	};

	public void startCar() {
		System.out.println("시동을 겁니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}

	// 상위 클래스에서 정의한 메서드중 하위 클래스에서 변경되면 안되는것은
	// final 을 붙여준다.
	public final void run() {
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
