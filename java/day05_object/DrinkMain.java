package day05_object;
public class DrinkMain {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 500, 3);
		coffee.getData(); // 커피 500 3 1500
		Drink tea = new Drink("녹차", 800, 5);
		tea.getData(); //녹차 800 5 4000 
		//판매금액
		System.out.println("판매금액 : " 
		+ (coffee.getTotal()+tea.getTotal()));
	}
}





