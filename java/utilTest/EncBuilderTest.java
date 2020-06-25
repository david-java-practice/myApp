package utilTest;

public class EncBuilderTest {
	private StringBuilder encrypt(String msg) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ') {  //공백이면
				sb.append(msg.charAt(i));
			}else {
				sb.append((char)(msg.charAt(i)+2));
			}
		}
		return sb;
	}
	
	private StringBuilder decrypt(String msg) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ') {  //공백이면
				sb.append(msg.charAt(i));
			}else {
				sb.append((char)(msg.charAt(i)-2));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		EncBuilderTest eb = new EncBuilderTest();
		String msg = "Hi.. Glad to meet you!!";
		System.out.println("암호화 전 : " + msg);
		String str1=eb.encrypt(msg).toString(); //한문자에 2씩 더하기
		System.out.println("암호화 후 : " + str1);
		System.out.println("복호화 후 : " + eb.decrypt(str1));//암호화 된 거에다 -2
	}

}
