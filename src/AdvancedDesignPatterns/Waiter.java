package AdvancedDesignPatterns;

//invoker
public class Waiter {
	private Order order;

	void takeOrder(Order order) {
		this.order = order;
	}

	void placeOrder() {
		order.cook();
	}

}
