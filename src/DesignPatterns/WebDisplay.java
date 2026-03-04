package DesignPatterns;

public class WebDisplay implements Display{	
	public void refresh(int price) {
		System.out.println("Web View: Price updated to " + price);
		
	}
}
