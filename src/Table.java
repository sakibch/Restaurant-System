public class Table {

	private int tableNum;
	private boolean paymentStatus;
	private Order[] Selection;

	/**
	 * 
	 * @param stat
	 */
	public void changePaymentStatus(boolean stat) {
		// TODO - implement Table.changePaymentStatus
		throw new UnsupportedOperationException();
	}

	public Table getTable() {
		// TODO - implement Table.getTable
		throw new UnsupportedOperationException();
	}

	public boolean getPaymentStatus() {
		return this.paymentStatus;
	}

	/**
	 * 
	 * @param stat
	 */
	public void setPaymentStatus(boolean stat) {
		this.paymentStatus = stat;
	}

}