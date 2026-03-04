package AdvancedDesignPatterns;

//concrete command
public class PizzaOrder implements Order {
	private Chef chef;

	PizzaOrder(Chef chef) {
		this.chef = chef;
	}

	public void cook() {
		chef.makePizza();
	}

}
