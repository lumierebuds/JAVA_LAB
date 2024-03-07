package template;

// 사람이 운전하는 자동차
public class ManualCar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조작합니다.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("사람이 브레이크로 정지합니다.");

	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub

		System.out.println("사람이 수동으로 와이퍼를 조작합니다.");

	}

}
