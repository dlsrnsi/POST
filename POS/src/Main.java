import java.util.Scanner;



public class Main {
	
	static Store store;
	static Money money;
	
	public static void main(String[] args) {
		store = new Store();
		money = new Money();
		startSale();
		provide();
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
		store.enterItem(1, 3);
		store.enterItem(2, 5);
		store.enterItem(3, 8);
		store.operateItem(store.getProvide().end());
	}
}
