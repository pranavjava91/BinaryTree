package DesignPatterns;

public interface StockServer {
	void register(Display d);

	void notifyDisplays();

	void updatePrice(int price);

}
