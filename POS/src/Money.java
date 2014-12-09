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
		System.out.println("���� �Ѿ��� " + totalMoney + "���Դϴ�.");
	}

	public void addMoney(int money) {
		System.out.println(money+"��ŭ�� ���� �����մϴ�");
		exEarningMoney = earningMoney;
		earningMoney = earningMoney + money - givingMoney;
		System.out.println("������ ������ "+earningMoney+"�Դϴ�");
		totalMoney = totalMoney + earningMoney + givingMoney;
	}

	public void giveMoney(Dealing dealer) {
		if (dealer.getClass().getName().equals("Store")) {
			dealer.setMoney(300000);
			totalMoney = totalMoney - 300000;
			givingMoney += 300000;
			System.out.println("������ 300000�� ���޵Ǿ����ϴ�");
		} else if (dealer.getClass().getName().equals("POST")) {
			dealer.setMoney(100000);
			totalMoney = totalMoney - 100000;
			givingMoney += 100000;
			System.out.println("POST�� 100000�� ���޵Ǿ����ϴ�");
		}
		System.out.println("���� �Ѿ��� " + totalMoney + "���Դϴ�.");

	}

	public void getSaleResult() {
		System.out.println("���� ������ " + totalMoney + "��ŭ �ֽ��ϴ�");
		System.out.println("������ ������ " + earningMoney + "�Դϴ�");
		System.out.println("������ ������ " + exEarningMoney + "�Դϴ�");
		System.out.println("�������� " + (earningMoney + exEarningMoney)
				+ "��ŭ �� �������ϴ�");
	}
}
