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
		System.out.println("상품 목록이 생성되었습니다.");
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
		System.out.println("요청하신 상품을 찾을 수 없습니다");
		return null;
	}

}
