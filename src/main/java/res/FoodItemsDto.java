package res;

public class FoodItemsDto {
	int foodId;
	String foodItemName;
	int price;
	String foodDescription;
	String isNonVeg;
	String isVeg;
	float avgRating;
	int cuisinId;
	int resId;
	public FoodItemsDto(int foodId, String foodItemName, int price, String foodDescription, String isNonVeg,
			String isVeg, float avgRating, int cuisinId, int resId) {
		super();
		this.foodId = foodId;
		this.foodItemName = foodItemName;
		this.price = price;
		this.foodDescription = foodDescription;
		this.isNonVeg = isNonVeg;
		this.isVeg = isVeg;
		this.avgRating = avgRating;
		this.cuisinId = cuisinId;
		this.resId = resId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodItemName() {
		return foodItemName;
	}
	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFoodDescription() {
		return foodDescription;
	}
	public void setFoodDescription(String foodDescription) {
		this.foodDescription = foodDescription;
	}
	public String getIsNonVeg() {
		return isNonVeg;
	}
	public void setIsNonVeg(String isNonVeg) {
		this.isNonVeg = isNonVeg;
	}
	public String getIsVeg() {
		return isVeg;
	}
	public void setIsVeg(String isVeg) {
		this.isVeg = isVeg;
	}
	public float getAvgRating() {
		return avgRating;
	}
	public void setAvgRating(float avgRating) {
		this.avgRating = avgRating;
	}
	public int getCuisinId() {
		return cuisinId;
	}
	public void setCuisinId(int cuisinId) {
		this.cuisinId = cuisinId;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	@Override
	public String toString() {
		return "FoodItemsDto [foodId=" + foodId + ", foodItemName=" + foodItemName + ", price=" + price
				+ ", foodDescription=" + foodDescription + ", isNonVeg=" + isNonVeg + ", isVeg=" + isVeg
				+ ", avgRating=" + avgRating + ", cuisinId=" + cuisinId + ", resId=" + resId + "]";
	}
	

}
