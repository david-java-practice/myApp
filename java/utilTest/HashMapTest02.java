package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map 
		                    = new HashMap<String, String>();
		map.put("java", "1111");
		map.put("oracle", "1234");
		map.put("jsp", "abcd");
		System.out.println("ID>>");
		String id  = sc.nextLine();
		System.out.println("PWD>>");
		String pwd  = sc.nextLine();
		if(map.containsKey(id)==false) {  //id �� ����
			System.out.println("ID ���� ����");
		}else if(map.get(id).equals(pwd)==false) {  //��� ����
			System.out.println("��� ��ġ ���� ����");
		}else {  //�� �� ��ġ
			System.out.println("ID/PWD ��ġ");
		}

	}

}



