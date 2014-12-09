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
		System.out.println(item.getName() + "을 " + quantity + "개만큼 팔음.");
		System.out.println("상점에는 "+item.getName()+"이 "+item.getNumber()+"남아있다");
	}

	@Override
	public int end() {
		Iterator itr = saleItemList.iterator();
		int i = 0;
		while (itr.hasNext()) {
			Item curItem = (Item) itr.next();
			int curPrice = curItem.getSalePrice() * (int) saleQuantityList.get(i);
			wholePrice += curPrice;
		}
		System.out.println("손님은 " + wholePrice + "원만큼의 물건을 구입했다");
		return wholePrice;
	}

}
