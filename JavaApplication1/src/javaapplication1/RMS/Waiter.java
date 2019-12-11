package RMS;

public class Waiter {
	private int employeeID;
	private int hourlyWage;

	// Constructor
	public Waiter(int employeeID, int hourlyWage){
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

	public void inputFoodItems(Order order, String foodName, double foodCost, String foodCategory){
		order.createFoodItem(foodName, foodCost, foodCategory);
	}
}
