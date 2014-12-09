import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import Item.*;

public class Store implements Dealing {

	private List<POST> postList;
	private int storedMoney;
	private boolean isOpen;
	private Provide provide;

	public Provide getProvide() {
		return provide;
	}

	public Store() {
		postList = new LinkedList<POST>();
		isOpen = true;
	}

	@Override
	public void enterItem(int itemID, int quantity) {
		// TODO Auto-generated method stub
		Item item = ItemCatalog.getInstance().findItem(itemID);
		provide.addItem(item, quantity);

	}

	@Override
	public void makePayment(int returnAmount) {
		storedMoney = storedMoney - returnAmount;
		System.out.println("현재 상점에는 " + storedMoney + "만큼의 돈이 있다");
	}

	@Override
	public void setMoney(int money) {
		storedMoney = money;
	}

	public void makeNewProvide() {
		provide = new Provide();
	}

	public void endProvide() {
		provide = null;
	}

	public void createPOST(int number) {
		for (int i = 0; i < number; i++) {
			POST post = new POST(i);
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

	public int finishSale() {
		isOpen = false;
		int totalEarning = 0;
		for (int i = 0; i < postList.size(); i++) {
			totalEarning += postList.get(i).getMoney();
			postList.get(i).setMoney(0);
		}
		totalEarning += storedMoney;
		System.out.println(totalEarning+"만큼을 회수하였습니다");
		storedMoney = 0;
		deletePOST();
		return totalEarning;

	}

	public List<POST> getPostList() {
		return postList;
	}

	@Override
	public int getMoney() {
		// TODO Auto-generated method stub
		return storedMoney;
	}

}
