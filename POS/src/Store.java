import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.*;

public class Store implements Dealing {

	private List<Item> itemList;
	private List<POST> postList;
	private int storedMoney;
	private int returnAmount;
	private boolean isOpen;
	private Provide provide;

	public Provide getProvide() {
		return provide;
	}

	public Store() {
		itemList = new LinkedList<Item>();
		postList = new LinkedList<POST>();
		isOpen = true;
		itemList.add(new Apple());
		itemList.add(new Banana());
		itemList.add(new Grape());
		System.out.println("상품 목록이 생성되었습니다.");
	}

	@Override
	public void enterItem(int itemID, int quantity) {
		// TODO Auto-generated method stub
		Item item=findItem(itemID);
		provide.addItem(item, quantity);

	}

	@Override
	public int makePayment(int returnAmount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getMoney(int money) {
		// TODO Auto-generated method stub
	}

	public void makeNewProvide() {
		provide = new Provide();
	}

	public void endProvide() {
		provide = null;
	}

	public void createPOST(int number) {
		for (int i = 0; i < number; i++) {
			POST post = new POST();
			postList.add(post);
			System.out.println("POST" + i + "가 생성되었습니다");
		}
	}

	public POST getPOST(int i) {
		return postList.get(i);
	}

	public void deletePOST() {
		postList.clear();
	}

	public void finishSale() {
		isOpen = false;
	}

	public List<POST> getPostList() {
		return postList;
	}
	public Item findItem(int itemID){
		Iterator itr=itemList.iterator();
		while(itr.hasNext()){
			Item curItem=(Item) itr.next();
			if(curItem.getID()==itemID){
				return curItem;
			}
		}
		System.out.println("요청하신 상품을 찾을 수 없습니다");
		return null;
	}
	public void operateItem(List<Item> dealingItemList){
		Iterator itr=itemList.iterator();
		Iterator itr2=dealingItemList.iterator();
		while(itr.hasNext()){
			Item item=(Item)itr.next();
			while(itr2.hasNext()){
				Item dealingItem = (Item)itr2.next();
				if(item.getID()==dealingItem.getID()){
					item.operateQuantity(dealingItem.getPrice()*dealingItem.getNumber());
					System.out.println(dealingItem.getName()+"를 "+ dealingItem.getNumber()+"개를 총"
							+dealingItem.getNumber()*dealingItem.getPrice()+"에 구입하였습니다");
					
				}
			}
		}
	}

}
