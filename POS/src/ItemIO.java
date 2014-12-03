import java.util.List;

import Item.Item;


public interface ItemIO {
	public void addItem(Item item, int quantity);
	public int getWholePrive();
	public List<Item> end();
}
