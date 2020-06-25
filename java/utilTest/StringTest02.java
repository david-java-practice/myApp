package utilTest;

public class StringTest02 {

	public static void main(String[] args) {
		String str = "안녕하세요 Hello  지금은 자바 공부중!!!";
		System.out.println("str 길이 :" + str.length());
		System.out.println("H위치 :" +str.indexOf('H'));
		System.out.println("H위치 :" +str.indexOf("Hello"));
		System.out.println("4번째문자 :" +str.charAt(4));
		String tmp="열심히 합시다";
		System.out.println("str 과 tmp 연결 : "+str+tmp);
		System.out.println("str 과 tmp 연결 : "+str.concat(tmp));
		int value =7;
		System.out.println("str 과 value 연결 : "+str+value);
		//concat 이용
		
		String s = String.valueOf(value);
		System.out.println("str 과 value 연결 : "+str.concat(s));
		System.out.println("tmp 과 value 연결 : "
		            +tmp.concat(String.valueOf(value)));
		String msg = "abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toUpperCase().toLowerCase());
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
	}

}










