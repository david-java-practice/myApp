package interfaceTest;


public class ConverterMain {
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); //원화를 달러로
		toDollar.run();
		Km2Mile toMile = new Km2Mile(1.6);  //km를 마일로
		toMile.run();
	}

}
