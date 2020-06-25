package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	void insertPlayer() {
		System.out.println("선수정보 등록...");
		System.out.print("이름 >>");
		String name = BookMain.sc.nextLine();
		System.out.print("주소 >>");
		String address = BookMain.sc.nextLine();
		System.out.print("나이 >>");
		int age = BookMain.sc.nextInt();
		System.out.print("키 >>");
		double height = BookMain.sc.nextDouble();
		System.out.print("몸무게 >>");
		double weight = BookMain.sc.nextDouble();
	}
	public void viewPlayer() {  //이름, 나이 출력
		 for(Player p   : arr) {
				System.out.println("이름 : " + p.name);
				System.out.println("나이 : " + p.age);
		 }
		
	}

}
