package inheritance;

public class GoldCustomer extends Customer {

	public GoldCustomer() {
		bonusRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo();
	}

}
