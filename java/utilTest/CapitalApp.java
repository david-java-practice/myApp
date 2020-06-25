package utilTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalApp {
	public static Scanner sc = new Scanner(System.in);
	private HashMap<String,String> map 
    = new HashMap<String, String>();
	public CapitalApp() { //������
		map.put("�ѱ�", "����");
		map.put("�Ϻ�", "����");
    	map.put("�߱�","������");
    	map.put("�̱�", "������");
    	map.put("����","����");
    	map.put("������", "�ĸ�");
    	map.put("����","������");
	}
 public  static void showMenu() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		System.out.print("�Է�:1, ����:2, ����:3>> ");
   }
	private void input() {
		System.out.println("���� " +map.size() +" �� ����� ���� �Է�");
		while(true) {
			System.out.println("����� ���� �Է�(�����  x)>>");
			String cont = sc.next(); //����
			if(cont.toUpperCase().equals("X")) break;
			//�ʿ� �Է��� ���� �ִ��� Ȯ��
			if(map.containsKey(cont)) { //map �� �Է��� ���� ����
				System.out.println("�̹� �Է��� �����Դϴ�.");
				continue;
			}
			String sudo = sc.next(); //����
			 map.put(cont, sudo);
			
		}
		
	}
	//��ǻ�Ͱ� �����ϰ� ���ø� �˷��ָ� �׿� ����
    // ������ �Է��ϸ� ����, ���� �Ǵ�����
	private void test() {
		Set<String>  set = map.keySet();
		//�迭�� ��ȯ
		Object[] arr = set.toArray(); // set�� �迭 ���·� ��ȯ(������ �˱�����)
		while(true) {
			int n = (int)(Math.random()*map.size());
			String city =(String) arr[n];//���� �̸�
		    String dosi = map.get(city);//�����̸�(��)
		    
		    //��������
		    System.out.println(city +" �� ������ ? ����� x >>");
		    String answer = sc.next();
		    if(answer.toLowerCase().equals("x")) break;
		    if(answer.equals(dosi)) {
		    	System.out.println("����");
		    }else {
		    	System.out.println("Ʋ�Ƚ��ϴ�.");
		    }
		    
  		}
		
	}

	public static void main(String[] args) {
		CapitalApp ca = new CapitalApp();
		while(true) {
			CapitalApp.showMenu();
			int choice =sc.nextInt(); 
			switch (choice) {
			case 1 : ca.input();	break;
			case 2 : ca.test(); break;
			case 3 :  System.out.println("����");
			                 System.exit(0);
			default: System.out.println("�Է¿���");
				
			}
		}

	}

}

