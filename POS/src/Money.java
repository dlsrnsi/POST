
public class Money {

	int earningMoney;
	int preparedMoney;
	int totalMoney;
	
	public Money(){
		earningMoney=0;
		preparedMoney=1000000;
		totalMoney=earningMoney+preparedMoney;
		System.out.println("���� �Ѿ��� "+totalMoney+"���Դϴ�.");
	}
	public void addMoney(int money){
		earningMoney = earningMoney + money;
		totalMoney=totalMoney+earningMoney;		
	}
	public void giveMoney(Dealing dealer){
		if(dealer.getClass().getName().equals("Store")){
			dealer.getMoney(300000);
			totalMoney=totalMoney-300000;
			System.out.println("������ 300000�� ���޵Ǿ����ϴ�");
		}
		else if(dealer.getClass().getName().equals("POST")){
			dealer.getMoney(100000);
			totalMoney=totalMoney-100000;
			System.out.println("POST�� 100000�� ���޵Ǿ����ϴ�");
		}
		System.out.println("���� �Ѿ��� "+totalMoney+"���Դϴ�.");
		
	}
}
