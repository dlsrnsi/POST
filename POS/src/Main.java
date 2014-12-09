import java.util.Scanner;

import Item.ItemCatalog;



public class Main {
	
	static Store store;
	static Money money;
	static ItemCatalog itemCatalog;
	
	public static void main(String[] args) {
		store = new Store();
		money = new Money();
		itemCatalog.getInstance();
		startSale();
		provide();
		sale();
		finishSale();
		getSaleResult();
	}

	public static void startSale() {
		int number = 3;
		store.createPOST(number);
		money.giveMoney(store);
		for(int i=0;i<store.getPostList().size();i++){
			money.giveMoney(store.getPOST(i));
		}
		
	}
	public static void provide(){
		store.makeNewProvide();
		store.enterItem(1, 10);
		store.enterItem(2, 20);
		store.enterItem(3, 15);
		store.makePayment(store.getProvide().end());
		store.endProvide();
	}
	public static void sale(){
		POST post=store.getPOST(0);
		post.makeNewSale();
		post.enterItem(1, 8);
		post.enterItem(2, 15);
		post.enterItem(3, 13);
		post.makePayment(post.getSale().end());
		post.endSale();
	}
	public static void finishSale(){
		money.addMoney(store.finishSale());
	}
	public static void getSaleResult(){
		money.getSaleResult();
	}
}
