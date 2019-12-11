package RMS;

public class ComputerTerminal {
	static void completeOrder(Order order){
		OrderManager.completeOrder(order);
	}

	public void makeOrder(Order order){
		Cook.makeOrder(order);
	}
}
