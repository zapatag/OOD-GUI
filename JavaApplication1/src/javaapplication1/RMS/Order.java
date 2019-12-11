package RMS;

import java.util.ArrayList;
import java.util.List;

class Order {
	private List<FoodItem> foodItem = new ArrayList<FoodItem>();
	float totalCost;
	private boolean isComplete;
	private int tableNum;

	Order(){

	}

	//Create a new food item and add it to the list of food items
	FoodItem createFoodItem(String foodName, double foodCost, String foodCategory){
		FoodItem newFoodItem = new FoodItem(foodName, foodCost, foodCategory);
		return newFoodItem;
	}

	void addFoodItem(FoodItem foodItem){
		this.foodItem.add(foodItem);
	}

	boolean isComplete() {
		return isComplete;
	}

	private Notification createNotification(){
		return new Notification(this);
	}

	// Complete the order
	void completeOrder(){
		this.isComplete = true;
		OrderManager.removeFromOrderQueue(this);
	}

	void setTable(int tableNum){
		this.tableNum = tableNum;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
}
