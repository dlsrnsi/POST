import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.Item;

public class Sale implements ItemIO {
	List<Item> saleItemList;
	int wholePrice;

	public Sale() {
		saleItemList = new LinkedList<Item>();
		int wholePrice;
	}

	@Override
	public void addItem(Item item, int quantity) {

	}

	@Override
	public List<Item> end() {
		// TODO Auto-generated method stub
		return saleItemList;
	}

	@Override
	public int getWholePrive() {
		Iterator itr=saleItemList.iterator();
		while(itr.hasNext()){
			int curPrice=((Item)itr).getPrice();
			wholePrice+=curPrice;
		}
		return wholePrice;
	}
}
