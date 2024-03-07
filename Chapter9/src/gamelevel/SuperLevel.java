package gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("겁나게 빨리 달립니다.");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("겁나게 높이 jump 합니다.");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("한바퀴 돕니다.");

	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("*****고급 레벨입니다*****");

	}

}
