package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Customer customerLee = new Customer(); customerLee.setCustomerID(10100);
		 * customerLee.setCustomerName("Lee");
		 */

		Customer customerKim = new VIPCustomer(10101, "Kim", 50);

		customerKim.bonusPoint = 1000;

		// System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());

	}

}
