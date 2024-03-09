package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매하기");

	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("구매하기");

	}

	// default 메서드가 중복될 수 있다.
	// 그럴때를 위해 상속받은 order를 재정의 해야함
	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");

	}

}
