package fooditem;

import annotations.Food;
import annotations.Time;

@Food(name = "Burger", price = 300)
public class Burger implements FoodInterface {
	private String name;
	private int price;
	private int prepareTime;
	private int cookTime;
	private int sendTime;

	/**
	 * @return the name
	 */
	@Override
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
	@Time(time = 30)
	public int getPrepareTime() {
		return prepareTime;
	}

	/**
	 * @param prepareTime the prepareTime to set
	 */
	public void setPrepareTime(int prepareTime) {
		this.prepareTime = prepareTime;
	}

	/**
	 * @return the cookTime
	 */
	@Time(time = 300)
	public int getCookTime() {
		return cookTime;
	}

	/**
	 * @param cookTime the cookTime to set
	 */
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}

	/**
	 * @return the sendTime
	 */
	@Time(time = 130)
	public int getSendTime() {
		return sendTime;
	}

	/**
	 * @param sendTime the sendTime to set
	 */
	public void setSendTime(int sendTime) {
		this.sendTime = sendTime;
	}

}
