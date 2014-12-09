public class Money {

	int earningMoney;
	int preparedMoney;
	int totalMoney;
	int exEarningMoney;
	int givingMoney;

	public Money() {
		exEarningMoney = 0;
		earningMoney = 0;
		preparedMoney = 1000000;
		givingMoney = 0;
		totalMoney = earningMoney + preparedMoney;
		System.out.println("현재 총액은 " + totalMoney + "원입니다.");
	}

	public void addMoney(int money) {
		System.out.println(money+"만큼의 돈을 보관합니다");
		exEarningMoney = earningMoney;
		earningMoney = earningMoney + money - givingMoney;
		System.out.println("오늘의 수입은 "+earningMoney+"입니다");
		totalMoney = totalMoney + earningMoney + givingMoney;
	}

	public void giveMoney(Dealing dealer) {
		if (dealer.getClass().getName().equals("Store")) {
			dealer.setMoney(300000);
			totalMoney = totalMoney - 300000;
			givingMoney += 300000;
			System.out.println("상점에 300000원 지급되었습니다");
		} else if (dealer.getClass().getName().equals("POST")) {
			dealer.setMoney(100000);
			totalMoney = totalMoney - 100000;
			givingMoney += 100000;
			System.out.println("POST에 100000원 지급되었습니다");
		}
		System.out.println("현재 총액은 " + totalMoney + "원입니다.");

	}

	public void getSaleResult() {
		System.out.println("현재 현금이 " + totalMoney + "만큼 있습니다");
		System.out.println("오늘의 수입은 " + earningMoney + "입니다");
		System.out.println("어제의 수입은 " + exEarningMoney + "입니다");
		System.out.println("어제보다 " + (earningMoney + exEarningMoney)
				+ "만큼 더 벌었습니다");
	}
}
