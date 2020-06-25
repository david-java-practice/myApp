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
		if(map.containsKey(id)==false) {  //id 가 없음
			System.out.println("ID 존재 안함");
		}else if(map.get(id).equals(pwd)==false) {  //비번 오류
			System.out.println("비번 일치 하지 않음");
		}else {  //둘 다 일치
			System.out.println("ID/PWD 일치");
		}

	}

}



