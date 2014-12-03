import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.Item;


public class Provide implements ItemIO {
	int wholePrice;
	List<Item> provideItemList;
	
	public Provide(){
		wholePrice=0;
		provideItemList = new LinkedList();
	}

	@Override
	public void addItem(Item item, int quantity) {
		item.setNumber(quantity);
		provideItemList.add(item);
	}

	@Override
	public List<Item> end() {
		// TODO Auto-generated method stub
		return provideItemList;
	}

	@Override
	public int getWholePrive() {
		// TODO Auto-generated method stub
		Iterator itr=provideItemList.iterator();
		while(itr.hasNext()){
			int curPrice=((Item)itr).getPrice();
			wholePrice+=curPrice;
		}
		return wholePrice;
	}
}
