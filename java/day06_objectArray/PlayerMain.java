package day06_objectArray;

public class PlayerMain {
	
   public static void showMenu() {
	   System.out.println("�����ϼ���...");
		System.out.println("1.�������");
		System.out.println("2.��������");
		System.out.println("3.����");
		System.out.print("����");
   }
	public static void main(String[] args) {
		PlayerManager pm = new PlayerManager();
		while(true) {
		 	PlayerMain.showMenu();
		 	int choice = BookMain.sc.nextInt();
		 	BookMain.sc.nextLine();
		 	switch(choice) {
		 	case 1:  pm.insertPlayer();break;
		 	case 2:  pm.viewPlayer();break;  // �̸�, ����
		  	case 3:  System.out.println("����");
		 					System.exit(0);
		 	default: System.out.println("�Է¿���");
		 	}

		}
	}

}
