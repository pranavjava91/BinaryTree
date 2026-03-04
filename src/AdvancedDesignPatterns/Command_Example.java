package AdvancedDesignPatterns;

public class Command_Example {

	public static void main(String[] args) {
		Chef chef = new Chef();
		Waiter waiter = new Waiter();
		waiter.takeOrder(new PizzaOrder(chef));
		waiter.placeOrder();
	}

}

/*
 * A restaurant waiter takes an order and gives it to the kitchen. The waiter
 * does not cook the food. The order acts like an instruction for the chef. Once
 * the chef receives it, they prepare the dish. The waiter only passes the
 * request. We need a system where the customer request is separated from how
 * the kitchen fulfills it. The waiter just triggers the action without knowing
 * the cooking process. Which design pattern matches this behavior where a
 * request is wrapped as an object and later executed by someone else?
 */

/*
 * This is a Command Pattern. The waiter is the invoker, the order is the
 * command, and the chef is the receiver who executes the request.
 */

/*
 * Command Pattern separates request creation from request execution. The
 * invoker just triggers the command, and the receiver performs the action. This
 * gives better control, supports undo operations, queues, and scheduling of
 * commands.
 */