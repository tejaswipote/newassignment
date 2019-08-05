package fooditem;

import annotations.Food;
import annotations.Time;

@Food(name = "Pizza", price = 300)
public class Pizza implements FoodInterface {
	private String name;
	private int price;
	private int prepareTime;
	private int cookTime;
	private int sendTime;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the prepareTime
	 */
	@Time(time = 60)
	public int getPrepareTime() {
		return prepareTime;
	}

	/**
	 * @return the cookTime
	 */
	@Time(time = 600)
	public int getCookTime() {
		return cookTime;
	}

	/**
	 * @return the sendTime
	 */
	@Time(time = 160)
	public int getSendTime() {
		return sendTime;
	}

}
