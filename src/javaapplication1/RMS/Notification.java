package javaapplication1.RMS;

public class Notification {
	private Order order;

	public Notification(Order order){
		this.order = order;
	}

	public String getNotification(){
		StringBuilder str = new StringBuilder();
		String orderFood = this.order.getFoodItem();
		int orderTable = this.order.getTable();
		str.append(orderFood);
		str.append("   For Table " + orderTable);
		return str.toString();
	}
}
