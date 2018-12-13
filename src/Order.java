public class Order {

	private int orderID;
	private Table table;
	private Order_Item[] items;
	private double bill;

	/**
	 * 
	 * @param item
	 */
	public void addItems(Order_Item item) {
		// TODO - implement Order.addItems
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param item
	 */
	public void removeItems(Order_Item item) {
		// TODO - implement Order.removeItems
		throw new UnsupportedOperationException();
	}

	public Order_Item[] getItems() {
		return this.items;
	}

	public void setBill() {
		// TODO - implement Order.setBill
		throw new UnsupportedOperationException();
	}

	public double getBill() {
		return this.bill;
	}

	/**
	 * 
	 * @param table
	 */
	public void changeTable(Table table) {
		// TODO - implement Order.changeTable
		throw new UnsupportedOperationException();
	}

}