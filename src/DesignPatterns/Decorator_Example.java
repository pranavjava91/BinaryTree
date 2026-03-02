package DesignPatterns;

public class Decorator_Example {
	public static void main(String[] args) {
		Coffee coffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
		
		//Coffee coffee = new MilkDecorator(new BasicCoffee());

		coffee.prepare();
	}

}
