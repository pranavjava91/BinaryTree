package DesignPatterns;

public class MobileDisplay implements Display {
	public void refresh(int price) {
		System.out.println("Mobile View: Price updated to " + price);
	}

}
