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

	public Order peek(){
		return orderQueue.peek();
	}

	public void completeOrder(){
		Order order = this.orderQueue.peek();
		order.completeOrder();
		removeFromOrderQueue();
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
