package inheritance;

public class Product {
	protected int price;
	protected int bonusPoint;
//	public Product() {
//		
//	}
	public Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}

}
