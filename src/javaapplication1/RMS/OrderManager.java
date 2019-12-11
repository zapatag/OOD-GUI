package javaapplication1.RMS;
import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {
	Queue<Order> orderQueue = new LinkedList<>();

	public void addToOrderQueue(Order order){
		orderQueue.add(order);
	}

	public void removeFromOrderQueue(){
		orderQueue.remove();
	}

	static void completeOrder(Order order){
		order.completeOrder();
	}

	public String printAllOrders(){
		StringBuilder str = new StringBuilder();
		for (Order order : this.orderQueue){
			String orderText = order.getFoodItem();
			str.append(orderText);
		}
		return str.toString();
	}
}
