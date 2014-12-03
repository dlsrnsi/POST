package Item;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ItemCatalog {
	private static ItemCatalog instance;
	private List<Item> itemList;

	private ItemCatalog() {
		itemList = new LinkedList<Item>();
		itemList.add(new Apple());
		itemList.add(new Banana());
		itemList.add(new Grape());
		System.out.println("��ǰ ����� �����Ǿ����ϴ�.");
	}

	public static ItemCatalog getInstance() {

		if (instance == null)

			instance = new ItemCatalog();

		return instance;

	}

	public Item findItem(int itemID) {
		Iterator itr = itemList.iterator();
		while (itr.hasNext()) {
			Item curItem = (Item) itr.next();
			if (curItem.getID() == itemID) {
				return curItem;
			}
		}
		System.out.println("��û�Ͻ� ��ǰ�� ã�� �� �����ϴ�");
		return null;
	}

}
