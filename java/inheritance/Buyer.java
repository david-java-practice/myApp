package inheritance;

public class Buyer {
	private int money;
	private int point;
	Product[] arr = new Product[10];
	int cnt;
	public Buyer(int money) {
		this.money =money;
	}
	
	//구매하기
	public void buy(Product p) {
		arr[cnt++] = p ; // tv   com
		money -= p.price;
		point += p.bonusPoint;
	}
	//구매내역
	public void showInfo() {
		for(int i=0; i<cnt;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("잔액 : " + money);
		System.out.println("포인트 : " +point );
	}
}
