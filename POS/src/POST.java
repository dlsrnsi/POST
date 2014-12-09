import Item.Item;
import Item.ItemCatalog;

public class POST implements Dealing {
	private int postID;
	private int storedMoney;
	private Sale sale;

	public POST(int id) {
		this.postID=id;
		storedMoney = 0;
	}

	public void makeNewSale() {
		System.out.println("손님이 POST"+postID+"에서 물건을 구입하려 한다");
		sale = new Sale();
	}

	public Sale getSale() {
		return sale;
	}

	public void endSale() {
		sale = null;
	}

	@Override
	public void enterItem(int itemID, int quantity) {
		// TODO Auto-generated method stub
		Item item = ItemCatalog.getInstance().findItem(itemID);
		sale.addItem(item, quantity);
	}

	@Override
	public void makePayment(int returnAmount) {
		storedMoney+=returnAmount;
		System.out.println("현재 Post"+postID+"에는 "+storedMoney+"만큼의 돈이 있다");
	}

	@Override
	public void setMoney(int money) {
		storedMoney=money;
	}

	@Override
	public int getMoney() {
		// TODO Auto-generated method stub
		return storedMoney;
	}

}
