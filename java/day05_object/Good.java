package day05_object;

public class Good {
	String name,code, maker;
	double discountRate;
	int price;
	//"001","레몬","레몬사",1000
	public Good(String code, String name, 
			                         String maker, int price) {
		this.name = name;
		this.code = code;
		this.maker = maker;
		this.price = price;
	}
	public int getSellingPrice() { //판매금액 : 원가격 - 할인가격
		return price-(int)(price*discountRate);
	}
	public void updateDiscountRate(double rate) {//할인율
		discountRate = rate;
	}

}
