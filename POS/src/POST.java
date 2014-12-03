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
		System.out.println("�մ��� POST"+postID+"���� ������ �����Ϸ� �Ѵ�");
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
		System.out.println("���� Post"+postID+"���� "+storedMoney+"��ŭ�� ���� �ִ�");
	}

	@Override
	public void getMoney(int money) {
		storedMoney+=money;
	}

}
