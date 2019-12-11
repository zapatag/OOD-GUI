package RMS;

class FoodItem {
	private String foodName;
	private double foodCost;
	private String foodCategory;

	FoodItem(String foodName, double foodCost, String foodCategory){
		this.foodName = foodName;
		this.foodCost = foodCost;
		this.foodCategory = foodCategory;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}
}
