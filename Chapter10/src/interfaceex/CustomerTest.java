package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();

		// customer 를 Buy 타입으로 buyer 변수에 대입
		// buy 인터페이스에 정의된 buy만 호출 가능
		Buy buyer = customer;
		buyer.buy();

		// customer 를 Sell 타입으로 buyer 변수에 대입
		// Seller 인터페이스에 정의된 sell만 호출 가능
		Sell seller = customer;
		seller.sell();

		// 자바는 가상 메서드로서 오버라이딩 된 메서드가 호출된다.
		seller.order();
		buyer.order();
		customer.order();

	}

}
