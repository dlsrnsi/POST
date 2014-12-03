import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.Item;

public class Provide implements ItemIO {
	int wholePrice;
	List<Item> provideItemList;
	List provideQuantityList;

	public Provide() {
		wholePrice = 0;
		provideItemList = new LinkedList();
		provideQuantityList = new LinkedList();
	}

	@Override
	public void addItem(Item item, int quantity) {
		item.operateQuantity(quantity);
		provideItemList.add(item);
		provideQuantityList.add(quantity);
		System.out.println(item.getName() + "�� " + quantity + "����ŭ ������.");
	}

	@Override
	public int end() {
		// TODO Auto-generated method stub
		Iterator itr = provideItemList.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Item curItem = (Item) itr.next();
			int curPrice = curItem.getPrice()
					* (int) provideQuantityList.get(i);
			wholePrice += curPrice;
		}
		System.out.println(wholePrice + "���� �����ߴ�");
		return wholePrice;
	}

}
