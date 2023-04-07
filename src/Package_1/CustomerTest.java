package Package_1;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Buy buy = customer;						//업캐스팅(간략?)
		buy.buy();
		Sell sell = customer;
		sell.sell();
		buy.order();
		sell.order();
	}

}
