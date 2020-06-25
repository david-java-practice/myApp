package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		HashMap<String, String> dic 
        = new HashMap<String, String>();
		dic.put("baby", "아기"); // "baby"는 key, "아기"은 value
		dic.put("love", "사랑"); 
		dic.put("apple", "사과");

		// 사용자로부터 영어 단어를 입력받고 한글 단어 검색.
		// "exit" 입력받으면 종료
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("단어입력.. 종료 exit>>");
			String eng = sc.next();
			if(eng.toLowerCase(). equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
				System.out.println(eng +" 는 없는 단어");
			}else {
				System.out.println(kor);
			}
		}
	}

}





