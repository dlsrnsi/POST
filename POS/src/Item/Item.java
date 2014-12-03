package Item;

public abstract class Item {
	int id;
	int price;
	int number;
	String name;

	public int getPrice() {
		return price;
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
