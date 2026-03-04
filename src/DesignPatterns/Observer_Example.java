package DesignPatterns;

public class Observer_Example {
	public static void main(String[] args) {
		StockMarket market = new StockMarket();
		market.register(new MobileDisplay());
		market.register(new WebDisplay());
		market.updatePrice(150);
		market.updatePrice(175);
	}

}

/*
 * A Java application displays stock prices on multiple screens. The stock value
 * changes throughout the day, and whenever there is a price update, all screens
 * should show the latest value. Currently, each screen repeatedly asks the
 * server for updates, which wastes resources and makes the system slow. We need
 * a design where the stock server notifies all registered displays
 * automatically whenever the price changes. Each display should update itself
 * without asking again and again. Which design pattern helps achieve a
 * publish-subscribe mechanism where one object notifies many dependent objects
 * when its state changes?
 */
/*
 * We can use Observer Pattern. The stock server is the subject, and the
 * displays are observers. When the stock price changes, the server notifies all
 * observers.
 */