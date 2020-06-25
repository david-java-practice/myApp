package day05_object;

public class Drink {
	String name;
	int price, count;
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getTotal() {
		return price*count ;
	}
	public void getData() {
		System.out.print(name +"\t");
		System.out.print(price +"\t");
		System.out.print(count +"\t");
		//System.out.print(price*count +"\n");
		System.out.print(getTotal() +"\n"); //판매금액
	}

}





