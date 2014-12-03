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
		store.enterItem(1, 100);
		store.enterItem(2, 80);
		store.enterItem(3, 60);
		store.makePayment(store.getProvide().end());
		store.endProvide();
	}
	public static void sale(){
		POST post=store.getPOST(0);
		post.makeNewSale();
		post.enterItem(1, 3);
		post.enterItem(2, 4);
		post.enterItem(3, 5);
		post.makePayment(post.getSale().end());
		post.endSale();
		
		
	}
}
