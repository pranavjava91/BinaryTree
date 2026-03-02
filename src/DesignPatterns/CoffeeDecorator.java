package DesignPatterns;

abstract class CoffeeDecorator implements Coffee {

	protected Coffee coffee;

	CoffeeDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

	public void prepare() {
		coffee.prepare();
	}

}

class MilkDecorator extends CoffeeDecorator {
	MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	public void prepare() {
		super.prepare();
		System.out.println("Adding Milk");
	}
}

class SugarDecorator extends CoffeeDecorator {
	SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	public void prepare() {
		super.prepare();
		System.out.println("Adding Sugar");
	}
}
