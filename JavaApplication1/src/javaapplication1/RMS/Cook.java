package RMS;

public class Cook {
	private int employeeID;
	private int hourlyWage;

	// Constructor
	public Cook(int employeeID, int hourlyWage){
		this.employeeID = employeeID;
		this.hourlyWage = hourlyWage;
	}

	public int getEmployeeID(){
		return employeeID;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public void makeOrder(Order order) {
		if (order.isComplete()) {
			order.completeOrder();
		}
	}
}
