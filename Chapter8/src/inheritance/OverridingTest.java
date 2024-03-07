package inheritance;

public class OverridingTest {

	public static void main(String[] args) {

		// Customer 클래스
		Customer customerLee = new Customer(100010, "LEE");
		int price = customerLee.calcPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerLee.showCustomerInfo());

		// VIPCustomer 클래스
		VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
		price = customerKim.calcPrice(10000);
		System.out.println("지불 금액은" + price + "이고," + customerKim.showCustomerInfo());

		// 업캐스팅한 크래스
		Customer customerWho = new VIPCustomer(100010, "Who", 100);
		price = customerWho.calcPrice(10000);
		System.out.println("지불 금액은" + price + "이고, " + customerWho.showCustomerInfo());

	}

}
