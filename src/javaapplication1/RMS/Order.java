package javaapplication1.RMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class Order {
	private List<FoodItem> foodItem = new ArrayList<FoodItem>();
	float totalCost;
	private boolean isComplete;
	Table table;

	public Order(){

	}

	//Create a new food item and add it to the list of food items
	public void createFoodItem(String foodName, double foodCost, String foodCategory){
		FoodItem newFoodItem = new FoodItem(foodName, foodCost, foodCategory);
		this.foodItem.add(newFoodItem);

	}

	public String getFoodItem(){
		StringBuilder foodItemString = new StringBuilder();

		for(FoodItem foodItem : foodItem){
			foodItemString.append(" - " + foodItem.foodName + ", ");
			foodItemString.append(foodItem.foodCategory + ", ");
			foodItemString.append("$" + foodItem.foodCost + "\n");
		}

		return foodItemString.toString();
	}


	boolean isComplete() {
		return isComplete;
	}

	// Complete the order
	void completeOrder(){
		this.isComplete = true;
	}

	void setTable(int tableNum){
		table = new Table(tableNum);
	}

	int getTable(){
		return table.getTableNum();
	}
}
