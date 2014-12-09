package Item;

public abstract class Item {
	int id;
	int salePrice;
	int providePrice;
	int number;
	String name;

	public int getSalePrice() {
		return salePrice;
	}
	public int getProvidePrice(){
		return providePrice;
	}

	public int getID() {
		return id;

	}

	public String getName() {
		return name;
	}
	public void operateQuantity(int quantity){
		number=number+quantity;		
	}
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}

}
