package inheritance;

public class ProductMain {

	public static void main(String[] args) {
	    Buyer b = new Buyer(1000);
	    TV tv = new TV(50);
	    Computer com = new Computer(100);
	    Audio audio = new Audio(70);
	    b.buy(tv);
	    b.buy(com);
	    b.buy(audio);
	    b.showInfo();

	}

}
