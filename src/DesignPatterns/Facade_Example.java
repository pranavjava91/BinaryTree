package DesignPatterns;


/*This is a good use case of the Facade Pattern. The facade class acts as a single-entry point and handles 
communication with multiple services behind the scenes. Client code becomes cleaner and easier to 
understand.*/

public class Facade_Example {
	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.placeOrder();
	}

}
