package day07;

public class IPTV  extends ColorTV{
	private String ipAddr;
	public IPTV(String ipAddr, int inch, int nColors) {
		super(inch, nColors);
		this.ipAddr = ipAddr;
   }
	public void printProperty() {
		System.out.println("나의 IPTV는 " + ipAddr+"주소");
		super.printProperty();
	}
}
