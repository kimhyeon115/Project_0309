package Package_1;

public class Customer implements Buy, Sell {

	public void sell() {
		System.out.println("판매하기");
	}
	public void buy() {
		System.out.println("구매하기");
	}
	public void order() {
		System.out.println("고객 판매 주문");
	}


}
