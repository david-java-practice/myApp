package inheritance;

public class Buyer {
	private int money;
	private int point;
	Product[] arr = new Product[10];
	int cnt;
	public Buyer(int money) {
		this.money =money;
	}
	
	//�����ϱ�
	public void buy(Product p) {
		arr[cnt++] = p ; // tv   com
		money -= p.price;
		point += p.bonusPoint;
	}
	//���ų���
	public void showInfo() {
		for(int i=0; i<cnt;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("�ܾ� : " + money);
		System.out.println("����Ʈ : " +point );
	}
}
