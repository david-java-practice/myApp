package utilTest;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hm 
		                           = new HashMap<String, String>();
		 hm.put("one", "첫번째");
		 hm.put("two", "두번째");
		 hm.put("three", "세번째");
		 hm.put("four", "네번째");
		 System.out.println(hm);
		 System.out.println(hm.size());
		 hm.put("one", "첫번째one");
		 System.out.println(hm);
		 System.out.println(hm.size());
		 System.out.println(hm.get("two"));
		 hm.put("1", "새로넣음");
		 System.out.println(hm);
		 //key 값을 출력
		 for(String s : hm.keySet()) {
			 System.out.println(s);
		 }
		//value 값을 출력
		 for(String s : hm.keySet()) {
			 System.out.println(hm.get(s));
		 }
		 System.out.println(hm.containsKey("1"));
		 System.out.println(hm.containsValue("두번째"));
		 for(String s : hm.values()) {
			 System.out.println(s);
		 }
	}

}



