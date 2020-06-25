package utilTest;

public class EncTest {
	/*
	  암호화 전 : Hi.. Glad to meet you!!
       암호화 후 : Jk00"Incf"vq"oggv"{qw##
       암호화 후 : Jk00 Incf vq oggv {qw##
	 */
	public String encrypt(String msg) {
		String dap = "";
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ') {  //공백이면
				dap+=msg.charAt(i);
			}else {
				dap+=(char)(msg.charAt(i)+2);
			}
		}
		return dap;
	}
	
	public String decrypt(String msg) {
		String dap = "";
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ') {  //공백이면
				dap+=msg.charAt(i);
			}else {
				dap+=(char)(msg.charAt(i)-2);
			}
		}
		return dap;
	}
	public static void main(String[] args) {
		EncTest enc = new EncTest();
		String msg = "Hi.. Glad to meet you!!";
		System.out.println("암호화 전 : " + msg);
		String str1=enc.encrypt(msg); //한문자에 2씩 더하기
		System.out.println("암호화 후 : " + str1);
		System.out.println("복호화 후 : " + enc.decrypt(str1));//암호화 된 거에다 -2
	}

}




