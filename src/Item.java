public class Item {

	private String ItemID;
	private String name;
	private String description;
	private double price;
	private boolean availability;
	private Ingredient[] ingredients;

	/**
	 * 
	 * @param name
	 */
	public void changeName(String name) {
		// TODO - implement Item.changeName
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param des
	 */
	public void changeDescription(String des) {
		// TODO - implement Item.changeDescription
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param price
	 */
	public void changePrice(double price) {
		// TODO - implement Item.changePrice
		throw new UnsupportedOperationException();
	}

	public boolean getAvailability() {
		return this.availability;
	}

	public Ingredient[] getIngredients() {
		return this.ingredients;
	}

}