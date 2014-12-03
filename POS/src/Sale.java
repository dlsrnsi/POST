import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.Item;

public class Sale implements ItemIO {
	List<Item> saleItemList;
	List saleQuantityList;
	int wholePrice;

	public Sale() {
		saleItemList = new LinkedList<Item>();
		saleQuantityList = new LinkedList();
		int wholePrice = 0;
	}

	@Override
	public void addItem(Item item, int quantity) {
		item.operateQuantity(-quantity);
		saleItemList.add(item);
		saleQuantityList.add(quantity);
		System.out.println(item.getName() + "�� " + quantity + "����ŭ ����.");
		System.out.println("�������� "+item.getName()+"�� "+item.getNumber()+"�����ִ�");
	}

	@Override
	public int end() {
		Iterator itr = saleItemList.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Item curItem = (Item) itr.next();
			int curPrice = curItem.getPrice() * (int) saleQuantityList.get(i);
			wholePrice += curPrice;
		}
		System.out.println("�մ��� " + wholePrice + "����ŭ�� ������ �����ߴ�");
		return wholePrice;
	}

}
