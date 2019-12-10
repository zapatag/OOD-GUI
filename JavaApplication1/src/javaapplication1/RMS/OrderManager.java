package RMS;
import java.util.LinkedList;
import java.util.Queue;

public class OrderManager {
	Queue<Order> orderQueue = new LinkedList<>();

	public void addToOrderQueue(Order order){
		orderQueue.add(order);
	}

	public void removeFromOrderQueue(Order order){
		orderQueue.remove(order);
	}

	static void completeOrder(Order order){
		order.completeOrder();
	}
}
