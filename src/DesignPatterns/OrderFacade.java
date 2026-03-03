package DesignPatterns;

public class OrderFacade {
	private UserService user = new UserService();
	private InventoryService inventory = new InventoryService();
	private PaymentService payment = new PaymentService();
	private NotificationService notify = new NotificationService();

	void placeOrder() {
		user.validateUser();
		inventory.checkStock();
		payment.makePayment();
		notify.sendNotification();
	}

}
