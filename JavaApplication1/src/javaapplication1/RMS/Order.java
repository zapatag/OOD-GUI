package RMS;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<FoodItem> foodItem = new ArrayList<FoodItem>();
	float totalCost;
	private boolean isComplete;
	int tableNum;

	public Order(){

	}

	//Create a new food item and add it to the list of food items
	public void createFoodItem(String foodName, double foodCost, String foodCategory){
		FoodItem newFoodItem = new FoodItem(foodName, foodCost, foodCategory);
		this.foodItem.add(newFoodItem);
	}

	boolean isComplete() {
		return isComplete;
	}

	// Complete the order
	void completeOrder(){
		this.isComplete = true;
	}

	void setTable(int tableNum){
		this.tableNum = tableNum;
	}
}
