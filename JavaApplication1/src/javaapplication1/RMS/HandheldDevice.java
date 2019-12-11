package RMS;


public class HandheldDevice {
	private Order order;

	public HandheldDevice(int activeTables){
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
		FoodItem foodItem = this.order.createFoodItem(foodName, foodCost, foodCategory);
		this.order.addFoodItem(foodItem);
	}

	public void notifyWaiter(){
		Notification waiterNotification = new Notification(this.order);
	}
}
