package javaapplication1.RMS;


public class HandheldDevice {
	private Order order;

	public HandheldDevice(){
	}



	private void createOrder(){
		this.order = new Order();
	}

	private void createTable(int tableNum){
		Table table = new Table(tableNum);
	}

	public void openOrderTicket(int tableNum){
		createOrder();
		createTable(tableNum);
	}

	public void inputOrder(String foodName, String foodCategory, double foodCost, int quantity){
		this.order.createFoodItem(foodName, foodCost, foodCategory);
	}

	public void printOrder(){
		System.out.println(order.getFoodItem());
	}

	public Order getOrder(){
		return this.order;
	}

	public void notifyWaiter(){
		Notification waiterNotification = new Notification(this.order);
	}
}
