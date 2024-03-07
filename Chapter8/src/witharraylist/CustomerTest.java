package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VIP, GOLD, SILVER 모든 고객들이 Customer 타입이 될 수 있다.
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10011, "신사임당");
		GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
		GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
		VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);

		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYul);
		customerList.add(customerKim);
		System.out.println("============고객 정보 출력============");

		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());

		}

		System.out.println("============할인율과 보너스 포인트 결과============");

		int price = 10000;
		for (Customer customer : customerList) {

			int cost = customer.calcPrice(price);

			System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하였습니다.");
			System.out.println(customer.showCustomerInfo());
		}
	}

}
