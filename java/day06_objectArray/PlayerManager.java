package day06_objectArray;

public class PlayerManager {
	private final int MAX_INT = 50;
	Player[] arr = new Player[MAX_INT];
	void insertPlayer() {
		System.out.println("�������� ���...");
		System.out.print("�̸� >>");
		String name = BookMain.sc.nextLine();
		System.out.print("�ּ� >>");
		String address = BookMain.sc.nextLine();
		System.out.print("���� >>");
		int age = BookMain.sc.nextInt();
		System.out.print("Ű >>");
		double height = BookMain.sc.nextDouble();
		System.out.print("������ >>");
		double weight = BookMain.sc.nextDouble();
	}
	public void viewPlayer() {  //�̸�, ���� ���
		 for(Player p   : arr) {
				System.out.println("�̸� : " + p.name);
				System.out.println("���� : " + p.age);
		 }
		
	}

}
