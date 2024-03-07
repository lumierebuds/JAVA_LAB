package template;

// 자율주행차
public class AICar extends Car {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 전환합니다.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("자동차가 스스로 멈춥니다.");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		System.out.println("비나 눈의 양에 따라 자동으로 조절됩니다.");
	}

	@Override
	public void washCar() {
		// TODO Auto-generated method stub
		System.out.println("자동으로 세차가 됩니다.");
	}

}
