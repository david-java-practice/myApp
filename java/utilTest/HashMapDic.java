package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		HashMap<String, String> dic 
        = new HashMap<String, String>();
		dic.put("baby", "�Ʊ�"); // "baby"�� key, "�Ʊ�"�� value
		dic.put("love", "���"); 
		dic.put("apple", "���");

		// ����ڷκ��� ���� �ܾ �Է¹ް� �ѱ� �ܾ� �˻�.
		// "exit" �Է¹����� ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�ܾ��Է�.. ���� exit>>");
			String eng = sc.next();
			if(eng.toLowerCase(). equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng +" �� ���� �ܾ�");
			}else {
				System.out.println(kor);
			}
		}
	}

}




