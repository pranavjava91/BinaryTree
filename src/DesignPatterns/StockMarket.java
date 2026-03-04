package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements StockServer{
	private List<Display> displays = new ArrayList<>();
	private int price;

	public void register(Display d) {
		displays.add(d);
	}

	public void updatePrice(int price) {
		this.price = price;
		notifyDisplays();
	}

	public void notifyDisplays() {
		for (Display d : displays) {
			d.refresh(price);
		}
	}

}
