package RMS;

class Notification {
	private Order order;

	Notification(Order order){
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public void notifyWaiter(Order order){

	}
}
