package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str="string";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.append("자바");
		System.out.println(sb);
		 sb.insert(2, "oracle");
		 System.out.println(sb);  //storaclering자바
		 System.out.println(sb.toString());
		 sb.delete(2, 5);
		 System.out.println(sb);//stclering자바
		 sb.reverse();
		 System.out.println(sb);
		 System.out.println(sb.charAt(3));
		 System.out.println(sb.substring(3));
		 System.out.println(sb.substring(3,5));
	}

	
	
	
	
	
}
