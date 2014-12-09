public interface Dealing {
	public void enterItem(int itemID, int quantity);

	public void makePayment(int returnAmount);
	public void setMoney(int money);
	public int getMoney();

}
