
public class Money {

	int earningMoney;
	int preparedMoney;
	int totalMoney;
	
	public Money(){
		earningMoney=0;
		preparedMoney=1000000;
		totalMoney=earningMoney+preparedMoney;
		System.out.println("현재 총액은 "+totalMoney+"원입니다.");
	}
	public void addMoney(int money){
		earningMoney = earningMoney + money;
		totalMoney=totalMoney+earningMoney;		
	}
	public void giveMoney(Dealing dealer){
		if(dealer.getClass().getName().equals("Store")){
			dealer.getMoney(300000);
			totalMoney=totalMoney-300000;
			System.out.println("상점에 300000원 지급되었습니다");
		}
		else if(dealer.getClass().getName().equals("POST")){
			dealer.getMoney(100000);
			totalMoney=totalMoney-100000;
			System.out.println("POST에 100000원 지급되었습니다");
		}
		System.out.println("현재 총액은 "+totalMoney+"원입니다.");
		
	}
}
